package restaurant.sa.com.sarestaurant.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import restaurant.sa.com.sarestaurant.dao.FavoriteRestaurantDao;
import restaurant.sa.com.sarestaurant.dao.FavoriteRestaurantDao_Impl;
import restaurant.sa.com.sarestaurant.dao.UserDao;
import restaurant.sa.com.sarestaurant.dao.UserDao_Impl;

@SuppressWarnings("unchecked")
public class UserDatabase_Impl extends UserDatabase {
  private volatile UserDao _userDao;

  private volatile FavoriteRestaurantDao _favoriteRestaurantDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `emailId` TEXT NOT NULL, `mobileNo` TEXT NOT NULL, `userName` TEXT NOT NULL, `password` TEXT NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_User_userName_emailId` ON `User` (`userName`, `emailId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `FavoriteRestaurant` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `adapter_position` INTEGER NOT NULL, `restaurant_name` TEXT NOT NULL, `restaurant_address` TEXT NOT NULL, `restaurant_img_path` TEXT NOT NULL, `is_favorite` INTEGER, `latitude` REAL, `longitude` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"9baec6d0b0ca416049ba36bdbbfaedcb\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `FavoriteRestaurant`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(5);
        _columnsUser.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1));
        _columnsUser.put("emailId", new TableInfo.Column("emailId", "TEXT", true, 0));
        _columnsUser.put("mobileNo", new TableInfo.Column("mobileNo", "TEXT", true, 0));
        _columnsUser.put("userName", new TableInfo.Column("userName", "TEXT", true, 0));
        _columnsUser.put("password", new TableInfo.Column("password", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(1);
        _indicesUser.add(new TableInfo.Index("index_User_userName_emailId", true, Arrays.asList("userName","emailId")));
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle User(restaurant.sa.com.sarestaurant.model.UserModel).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteRestaurant = new HashMap<String, TableInfo.Column>(8);
        _columnsFavoriteRestaurant.put("_id", new TableInfo.Column("_id", "INTEGER", false, 1));
        _columnsFavoriteRestaurant.put("adapter_position", new TableInfo.Column("adapter_position", "INTEGER", true, 0));
        _columnsFavoriteRestaurant.put("restaurant_name", new TableInfo.Column("restaurant_name", "TEXT", true, 0));
        _columnsFavoriteRestaurant.put("restaurant_address", new TableInfo.Column("restaurant_address", "TEXT", true, 0));
        _columnsFavoriteRestaurant.put("restaurant_img_path", new TableInfo.Column("restaurant_img_path", "TEXT", true, 0));
        _columnsFavoriteRestaurant.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", false, 0));
        _columnsFavoriteRestaurant.put("latitude", new TableInfo.Column("latitude", "REAL", false, 0));
        _columnsFavoriteRestaurant.put("longitude", new TableInfo.Column("longitude", "REAL", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteRestaurant = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteRestaurant = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteRestaurant = new TableInfo("FavoriteRestaurant", _columnsFavoriteRestaurant, _foreignKeysFavoriteRestaurant, _indicesFavoriteRestaurant);
        final TableInfo _existingFavoriteRestaurant = TableInfo.read(_db, "FavoriteRestaurant");
        if (! _infoFavoriteRestaurant.equals(_existingFavoriteRestaurant)) {
          throw new IllegalStateException("Migration didn't properly handle FavoriteRestaurant(restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel).\n"
                  + " Expected:\n" + _infoFavoriteRestaurant + "\n"
                  + " Found:\n" + _existingFavoriteRestaurant);
        }
      }
    }, "9baec6d0b0ca416049ba36bdbbfaedcb", "92487d52e797c31414301824da1020aa");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "User","FavoriteRestaurant");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `FavoriteRestaurant`");
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
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public FavoriteRestaurantDao favoriteRestaurantDao() {
    if (_favoriteRestaurantDao != null) {
      return _favoriteRestaurantDao;
    } else {
      synchronized(this) {
        if(_favoriteRestaurantDao == null) {
          _favoriteRestaurantDao = new FavoriteRestaurantDao_Impl(this);
        }
        return _favoriteRestaurantDao;
      }
    }
  }
}
