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
import com.ec.MuseumAR.data.model.Oeuvre;
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
public final class OeuvreDao_Impl implements OeuvreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Oeuvre> __insertionAdapterOfOeuvre;

  public OeuvreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOeuvre = new EntityInsertionAdapter<Oeuvre>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Oeuvre` (`oeuvreId`,`oeuvreTitre`,`description`,`auteur`,`position`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Oeuvre value) {
        stmt.bindLong(1, value.getOeuvreId());
        if (value.getOeuvreTitre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOeuvreTitre());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAuteur() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAuteur());
        }
        if (value.getPosition() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPosition());
        }
      }
    };
  }

  @Override
  public Object addNewOeuvre(final Oeuvre newOeuvre, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOeuvre.insert(newOeuvre);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object getAllOeuvres(final Continuation<? super List<Oeuvre>> arg0) {
    final String _sql = "SELECT * FROM oeuvre";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Oeuvre>>() {
      @Override
      public List<Oeuvre> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOeuvreId = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreId");
          final int _cursorIndexOfOeuvreTitre = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreTitre");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAuteur = CursorUtil.getColumnIndexOrThrow(_cursor, "auteur");
          final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
          final List<Oeuvre> _result = new ArrayList<Oeuvre>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Oeuvre _item;
            final long _tmpOeuvreId;
            _tmpOeuvreId = _cursor.getLong(_cursorIndexOfOeuvreId);
            final String _tmpOeuvreTitre;
            if (_cursor.isNull(_cursorIndexOfOeuvreTitre)) {
              _tmpOeuvreTitre = null;
            } else {
              _tmpOeuvreTitre = _cursor.getString(_cursorIndexOfOeuvreTitre);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpAuteur;
            if (_cursor.isNull(_cursorIndexOfAuteur)) {
              _tmpAuteur = null;
            } else {
              _tmpAuteur = _cursor.getString(_cursorIndexOfAuteur);
            }
            final String _tmpPosition;
            if (_cursor.isNull(_cursorIndexOfPosition)) {
              _tmpPosition = null;
            } else {
              _tmpPosition = _cursor.getString(_cursorIndexOfPosition);
            }
            _item = new Oeuvre(_tmpOeuvreId,_tmpOeuvreTitre,_tmpDescription,_tmpAuteur,_tmpPosition);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg0);
  }

  @Override
  public Object getOeuvreById(final long oeuvreId, final Continuation<? super Oeuvre> arg1) {
    final String _sql = "SELECT * FROM oeuvre WHERE oeuvreId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, oeuvreId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Oeuvre>() {
      @Override
      public Oeuvre call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOeuvreId = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreId");
          final int _cursorIndexOfOeuvreTitre = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreTitre");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAuteur = CursorUtil.getColumnIndexOrThrow(_cursor, "auteur");
          final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
          final Oeuvre _result;
          if(_cursor.moveToFirst()) {
            final long _tmpOeuvreId;
            _tmpOeuvreId = _cursor.getLong(_cursorIndexOfOeuvreId);
            final String _tmpOeuvreTitre;
            if (_cursor.isNull(_cursorIndexOfOeuvreTitre)) {
              _tmpOeuvreTitre = null;
            } else {
              _tmpOeuvreTitre = _cursor.getString(_cursorIndexOfOeuvreTitre);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpAuteur;
            if (_cursor.isNull(_cursorIndexOfAuteur)) {
              _tmpAuteur = null;
            } else {
              _tmpAuteur = _cursor.getString(_cursorIndexOfAuteur);
            }
            final String _tmpPosition;
            if (_cursor.isNull(_cursorIndexOfPosition)) {
              _tmpPosition = null;
            } else {
              _tmpPosition = _cursor.getString(_cursorIndexOfPosition);
            }
            _result = new Oeuvre(_tmpOeuvreId,_tmpOeuvreTitre,_tmpDescription,_tmpAuteur,_tmpPosition);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
