package com.ec.MuseumAR.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MuseumRoomDatabase_Impl extends MuseumRoomDatabase {
  private volatile OeuvreDao _oeuvreDao;

  private volatile ParcoursDao _parcoursDao;

  private volatile ParcoursWithOeuvresDao _parcoursWithOeuvresDao;

  private volatile PositionDao _positionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Oeuvre` (`oeuvreId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `oeuvreTitre` TEXT NOT NULL, `description` TEXT NOT NULL, `auteur` TEXT NOT NULL, `position` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Parcours` (`parcoursId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `theme` TEXT NOT NULL, `duree` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ParcoursOeuvreCrossRef` (`parcoursId` INTEGER NOT NULL, `oeuvreId` INTEGER NOT NULL, PRIMARY KEY(`parcoursId`, `oeuvreId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Position` (`id` INTEGER NOT NULL, `to1` TEXT NOT NULL, `to2` TEXT NOT NULL, `to3` TEXT NOT NULL, `to4` TEXT NOT NULL, `to5` TEXT NOT NULL, `to6` TEXT NOT NULL, `to7` TEXT NOT NULL, `to8` TEXT NOT NULL, `to9` TEXT NOT NULL, `to10` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7346d63f41d742bfee1b1882e8cdfc7f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Oeuvre`");
        _db.execSQL("DROP TABLE IF EXISTS `Parcours`");
        _db.execSQL("DROP TABLE IF EXISTS `ParcoursOeuvreCrossRef`");
        _db.execSQL("DROP TABLE IF EXISTS `Position`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsOeuvre = new HashMap<String, TableInfo.Column>(5);
        _columnsOeuvre.put("oeuvreId", new TableInfo.Column("oeuvreId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOeuvre.put("oeuvreTitre", new TableInfo.Column("oeuvreTitre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOeuvre.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOeuvre.put("auteur", new TableInfo.Column("auteur", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOeuvre.put("position", new TableInfo.Column("position", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOeuvre = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOeuvre = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOeuvre = new TableInfo("Oeuvre", _columnsOeuvre, _foreignKeysOeuvre, _indicesOeuvre);
        final TableInfo _existingOeuvre = TableInfo.read(_db, "Oeuvre");
        if (! _infoOeuvre.equals(_existingOeuvre)) {
          return new RoomOpenHelper.ValidationResult(false, "Oeuvre(com.ec.MuseumAR.data.model.Oeuvre).\n"
                  + " Expected:\n" + _infoOeuvre + "\n"
                  + " Found:\n" + _existingOeuvre);
        }
        final HashMap<String, TableInfo.Column> _columnsParcours = new HashMap<String, TableInfo.Column>(3);
        _columnsParcours.put("parcoursId", new TableInfo.Column("parcoursId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParcours.put("theme", new TableInfo.Column("theme", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParcours.put("duree", new TableInfo.Column("duree", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysParcours = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesParcours = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoParcours = new TableInfo("Parcours", _columnsParcours, _foreignKeysParcours, _indicesParcours);
        final TableInfo _existingParcours = TableInfo.read(_db, "Parcours");
        if (! _infoParcours.equals(_existingParcours)) {
          return new RoomOpenHelper.ValidationResult(false, "Parcours(com.ec.MuseumAR.data.model.Parcours).\n"
                  + " Expected:\n" + _infoParcours + "\n"
                  + " Found:\n" + _existingParcours);
        }
        final HashMap<String, TableInfo.Column> _columnsParcoursOeuvreCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsParcoursOeuvreCrossRef.put("parcoursId", new TableInfo.Column("parcoursId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsParcoursOeuvreCrossRef.put("oeuvreId", new TableInfo.Column("oeuvreId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysParcoursOeuvreCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesParcoursOeuvreCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoParcoursOeuvreCrossRef = new TableInfo("ParcoursOeuvreCrossRef", _columnsParcoursOeuvreCrossRef, _foreignKeysParcoursOeuvreCrossRef, _indicesParcoursOeuvreCrossRef);
        final TableInfo _existingParcoursOeuvreCrossRef = TableInfo.read(_db, "ParcoursOeuvreCrossRef");
        if (! _infoParcoursOeuvreCrossRef.equals(_existingParcoursOeuvreCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "ParcoursOeuvreCrossRef(com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef).\n"
                  + " Expected:\n" + _infoParcoursOeuvreCrossRef + "\n"
                  + " Found:\n" + _existingParcoursOeuvreCrossRef);
        }
        final HashMap<String, TableInfo.Column> _columnsPosition = new HashMap<String, TableInfo.Column>(11);
        _columnsPosition.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to1", new TableInfo.Column("to1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to2", new TableInfo.Column("to2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to3", new TableInfo.Column("to3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to4", new TableInfo.Column("to4", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to5", new TableInfo.Column("to5", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to6", new TableInfo.Column("to6", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to7", new TableInfo.Column("to7", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to8", new TableInfo.Column("to8", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to9", new TableInfo.Column("to9", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPosition.put("to10", new TableInfo.Column("to10", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPosition = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPosition = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPosition = new TableInfo("Position", _columnsPosition, _foreignKeysPosition, _indicesPosition);
        final TableInfo _existingPosition = TableInfo.read(_db, "Position");
        if (! _infoPosition.equals(_existingPosition)) {
          return new RoomOpenHelper.ValidationResult(false, "Position(com.ec.MuseumAR.data.model.Position).\n"
                  + " Expected:\n" + _infoPosition + "\n"
                  + " Found:\n" + _existingPosition);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7346d63f41d742bfee1b1882e8cdfc7f", "cbcaace69dc828899bf518cef399c4b4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Oeuvre","Parcours","ParcoursOeuvreCrossRef","Position");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Oeuvre`");
      _db.execSQL("DELETE FROM `Parcours`");
      _db.execSQL("DELETE FROM `ParcoursOeuvreCrossRef`");
      _db.execSQL("DELETE FROM `Position`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(OeuvreDao.class, OeuvreDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ParcoursDao.class, ParcoursDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ParcoursWithOeuvresDao.class, ParcoursWithOeuvresDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PositionDao.class, PositionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public OeuvreDao oeuvreDao() {
    if (_oeuvreDao != null) {
      return _oeuvreDao;
    } else {
      synchronized(this) {
        if(_oeuvreDao == null) {
          _oeuvreDao = new OeuvreDao_Impl(this);
        }
        return _oeuvreDao;
      }
    }
  }

  @Override
  public ParcoursDao parcoursDao() {
    if (_parcoursDao != null) {
      return _parcoursDao;
    } else {
      synchronized(this) {
        if(_parcoursDao == null) {
          _parcoursDao = new ParcoursDao_Impl(this);
        }
        return _parcoursDao;
      }
    }
  }

  @Override
  public ParcoursWithOeuvresDao parcoursWithOeuvresDao() {
    if (_parcoursWithOeuvresDao != null) {
      return _parcoursWithOeuvresDao;
    } else {
      synchronized(this) {
        if(_parcoursWithOeuvresDao == null) {
          _parcoursWithOeuvresDao = new ParcoursWithOeuvresDao_Impl(this);
        }
        return _parcoursWithOeuvresDao;
      }
    }
  }

  @Override
  public PositionDao positionDao() {
    if (_positionDao != null) {
      return _positionDao;
    } else {
      synchronized(this) {
        if(_positionDao == null) {
          _positionDao = new PositionDao_Impl(this);
        }
        return _positionDao;
      }
    }
  }
}
