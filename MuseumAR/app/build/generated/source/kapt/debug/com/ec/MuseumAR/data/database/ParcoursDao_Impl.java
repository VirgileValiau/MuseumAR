package com.ec.MuseumAR.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ec.MuseumAR.data.model.Parcours;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ParcoursDao_Impl implements ParcoursDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Parcours> __insertionAdapterOfParcours;

  public ParcoursDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfParcours = new EntityInsertionAdapter<Parcours>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Parcours` (`parcoursId`,`theme`,`duree`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Parcours value) {
        stmt.bindLong(1, value.getParcoursId());
        if (value.getTheme() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTheme());
        }
        stmt.bindLong(3, value.getDuree());
      }
    };
  }

  @Override
  public Object addNewParcours(final Parcours newParcours, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfParcours.insert(newParcours);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllParcours(final Continuation<? super List<Parcours>> p0) {
    final String _sql = "SELECT * FROM parcours";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Parcours>>() {
      @Override
      public List<Parcours> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfParcoursId = CursorUtil.getColumnIndexOrThrow(_cursor, "parcoursId");
          final int _cursorIndexOfTheme = CursorUtil.getColumnIndexOrThrow(_cursor, "theme");
          final int _cursorIndexOfDuree = CursorUtil.getColumnIndexOrThrow(_cursor, "duree");
          final List<Parcours> _result = new ArrayList<Parcours>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Parcours _item;
            final long _tmpParcoursId;
            _tmpParcoursId = _cursor.getLong(_cursorIndexOfParcoursId);
            final String _tmpTheme;
            if (_cursor.isNull(_cursorIndexOfTheme)) {
              _tmpTheme = null;
            } else {
              _tmpTheme = _cursor.getString(_cursorIndexOfTheme);
            }
            final int _tmpDuree;
            _tmpDuree = _cursor.getInt(_cursorIndexOfDuree);
            _item = new Parcours(_tmpParcoursId,_tmpTheme,_tmpDuree);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getParcoursById(final long parcoursId, final Continuation<? super Parcours> p1) {
    final String _sql = "SELECT * FROM parcours WHERE parcoursId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, parcoursId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Parcours>() {
      @Override
      public Parcours call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfParcoursId = CursorUtil.getColumnIndexOrThrow(_cursor, "parcoursId");
          final int _cursorIndexOfTheme = CursorUtil.getColumnIndexOrThrow(_cursor, "theme");
          final int _cursorIndexOfDuree = CursorUtil.getColumnIndexOrThrow(_cursor, "duree");
          final Parcours _result;
          if(_cursor.moveToFirst()) {
            final long _tmpParcoursId;
            _tmpParcoursId = _cursor.getLong(_cursorIndexOfParcoursId);
            final String _tmpTheme;
            if (_cursor.isNull(_cursorIndexOfTheme)) {
              _tmpTheme = null;
            } else {
              _tmpTheme = _cursor.getString(_cursorIndexOfTheme);
            }
            final int _tmpDuree;
            _tmpDuree = _cursor.getInt(_cursorIndexOfDuree);
            _result = new Parcours(_tmpParcoursId,_tmpTheme,_tmpDuree);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
