package com.ec.MuseumAR.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PositionDao_Impl implements PositionDao {
  private final RoomDatabase __db;

  public PositionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getPosition(final long fromId, final String toId,
      final Continuation<? super String> arg2) {
    final String _sql = "SELECT ? FROM Position WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (toId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, toId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, fromId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            final String _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg2);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
