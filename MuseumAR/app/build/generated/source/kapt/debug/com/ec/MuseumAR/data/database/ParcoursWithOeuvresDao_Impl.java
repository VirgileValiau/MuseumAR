package com.ec.MuseumAR.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.ec.MuseumAR.data.model.Oeuvre;
import com.ec.MuseumAR.data.model.Parcours;
import com.ec.MuseumAR.data.model.ParcoursWithOeuvres;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ParcoursWithOeuvresDao_Impl implements ParcoursWithOeuvresDao {
  private final RoomDatabase __db;

  public ParcoursWithOeuvresDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getAllParcoursWithOeuvres(
      final Continuation<? super List<ParcoursWithOeuvres>> arg0) {
    final String _sql = "SELECT * FROM parcours";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<ParcoursWithOeuvres>>() {
      @Override
      public List<ParcoursWithOeuvres> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfParcoursId = CursorUtil.getColumnIndexOrThrow(_cursor, "parcoursId");
            final int _cursorIndexOfTheme = CursorUtil.getColumnIndexOrThrow(_cursor, "theme");
            final int _cursorIndexOfDuree = CursorUtil.getColumnIndexOrThrow(_cursor, "duree");
            final LongSparseArray<ArrayList<Oeuvre>> _collectionOeuvres = new LongSparseArray<ArrayList<Oeuvre>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfParcoursId);
              ArrayList<Oeuvre> _tmpOeuvresCollection = _collectionOeuvres.get(_tmpKey);
              if (_tmpOeuvresCollection == null) {
                _tmpOeuvresCollection = new ArrayList<Oeuvre>();
                _collectionOeuvres.put(_tmpKey, _tmpOeuvresCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipOeuvreAscomEcMuseumARDataModelOeuvre(_collectionOeuvres);
            final List<ParcoursWithOeuvres> _result = new ArrayList<ParcoursWithOeuvres>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final ParcoursWithOeuvres _item;
              final Parcours _tmpParcours;
              if (! (_cursor.isNull(_cursorIndexOfParcoursId) && _cursor.isNull(_cursorIndexOfTheme) && _cursor.isNull(_cursorIndexOfDuree))) {
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
                _tmpParcours = new Parcours(_tmpParcoursId,_tmpTheme,_tmpDuree);
              }  else  {
                _tmpParcours = null;
              }
              ArrayList<Oeuvre> _tmpOeuvresCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfParcoursId);
              _tmpOeuvresCollection_1 = _collectionOeuvres.get(_tmpKey_1);
              if (_tmpOeuvresCollection_1 == null) {
                _tmpOeuvresCollection_1 = new ArrayList<Oeuvre>();
              }
              _item = new ParcoursWithOeuvres(_tmpParcours,_tmpOeuvresCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, arg0);
  }

  @Override
  public Object getParcoursWithOeuvresById(final long parcoursId,
      final Continuation<? super ParcoursWithOeuvres> arg1) {
    final String _sql = "SELECT * FROM parcours WHERE parcoursId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, parcoursId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<ParcoursWithOeuvres>() {
      @Override
      public ParcoursWithOeuvres call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfParcoursId = CursorUtil.getColumnIndexOrThrow(_cursor, "parcoursId");
            final int _cursorIndexOfTheme = CursorUtil.getColumnIndexOrThrow(_cursor, "theme");
            final int _cursorIndexOfDuree = CursorUtil.getColumnIndexOrThrow(_cursor, "duree");
            final LongSparseArray<ArrayList<Oeuvre>> _collectionOeuvres = new LongSparseArray<ArrayList<Oeuvre>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfParcoursId);
              ArrayList<Oeuvre> _tmpOeuvresCollection = _collectionOeuvres.get(_tmpKey);
              if (_tmpOeuvresCollection == null) {
                _tmpOeuvresCollection = new ArrayList<Oeuvre>();
                _collectionOeuvres.put(_tmpKey, _tmpOeuvresCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipOeuvreAscomEcMuseumARDataModelOeuvre(_collectionOeuvres);
            final ParcoursWithOeuvres _result;
            if(_cursor.moveToFirst()) {
              final Parcours _tmpParcours;
              if (! (_cursor.isNull(_cursorIndexOfParcoursId) && _cursor.isNull(_cursorIndexOfTheme) && _cursor.isNull(_cursorIndexOfDuree))) {
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
                _tmpParcours = new Parcours(_tmpParcoursId,_tmpTheme,_tmpDuree);
              }  else  {
                _tmpParcours = null;
              }
              ArrayList<Oeuvre> _tmpOeuvresCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfParcoursId);
              _tmpOeuvresCollection_1 = _collectionOeuvres.get(_tmpKey_1);
              if (_tmpOeuvresCollection_1 == null) {
                _tmpOeuvresCollection_1 = new ArrayList<Oeuvre>();
              }
              _result = new ParcoursWithOeuvres(_tmpParcours,_tmpOeuvresCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipOeuvreAscomEcMuseumARDataModelOeuvre(
      final LongSparseArray<ArrayList<Oeuvre>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Oeuvre>> _tmpInnerMap = new LongSparseArray<ArrayList<Oeuvre>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipOeuvreAscomEcMuseumARDataModelOeuvre(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Oeuvre>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipOeuvreAscomEcMuseumARDataModelOeuvre(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `Oeuvre`.`oeuvreId` AS `oeuvreId`,`Oeuvre`.`oeuvreTitre` AS `oeuvreTitre`,`Oeuvre`.`description` AS `description`,`Oeuvre`.`auteur` AS `auteur`,`Oeuvre`.`position` AS `position`,_junction.`parcoursId` FROM `ParcoursOeuvreCrossRef` AS _junction INNER JOIN `Oeuvre` ON (_junction.`oeuvreId` = `Oeuvre`.`oeuvreId`) WHERE _junction.`parcoursId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 5; // _junction.parcoursId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfOeuvreId = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreId");
      final int _cursorIndexOfOeuvreTitre = CursorUtil.getColumnIndexOrThrow(_cursor, "oeuvreTitre");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfAuteur = CursorUtil.getColumnIndexOrThrow(_cursor, "auteur");
      final int _cursorIndexOfPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Oeuvre> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Oeuvre _item_1;
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
          _item_1 = new Oeuvre(_tmpOeuvreId,_tmpOeuvreTitre,_tmpDescription,_tmpAuteur,_tmpPosition);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
