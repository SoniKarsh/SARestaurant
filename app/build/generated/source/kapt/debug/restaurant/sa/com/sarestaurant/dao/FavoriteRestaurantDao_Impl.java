package restaurant.sa.com.sarestaurant.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import restaurant.sa.com.sarestaurant.model.FavoriteRestaurantModel;

@SuppressWarnings("unchecked")
public class FavoriteRestaurantDao_Impl implements FavoriteRestaurantDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfFavoriteRestaurantModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfFavoriteRestaurantModel;

  private final SharedSQLiteStatement __preparedStmtOfRemoveItem;

  public FavoriteRestaurantDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteRestaurantModel = new EntityInsertionAdapter<FavoriteRestaurantModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `FavoriteRestaurant`(`_id`,`adapter_position`,`restaurant_name`,`restaurant_address`,`restaurant_img_path`,`is_favorite`,`latitude`,`longitude`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteRestaurantModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.get_id());
        }
        stmt.bindLong(2, value.getAdapterPosition());
        if (value.getRestaurantName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRestaurantName());
        }
        if (value.getRestaurantAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRestaurantAddress());
        }
        if (value.getRestaurantImagePath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRestaurantImagePath());
        }
        final Integer _tmp;
        _tmp = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getLongitude());
        }
      }
    };
    this.__updateAdapterOfFavoriteRestaurantModel = new EntityDeletionOrUpdateAdapter<FavoriteRestaurantModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `FavoriteRestaurant` SET `_id` = ?,`adapter_position` = ?,`restaurant_name` = ?,`restaurant_address` = ?,`restaurant_img_path` = ?,`is_favorite` = ?,`latitude` = ?,`longitude` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteRestaurantModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.get_id());
        }
        stmt.bindLong(2, value.getAdapterPosition());
        if (value.getRestaurantName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRestaurantName());
        }
        if (value.getRestaurantAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRestaurantAddress());
        }
        if (value.getRestaurantImagePath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRestaurantImagePath());
        }
        final Integer _tmp;
        _tmp = value.isFavorite() == null ? null : (value.isFavorite() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getLongitude());
        }
        if (value.get_id() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.get_id());
        }
      }
    };
    this.__preparedStmtOfRemoveItem = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from FavoriteRestaurant WHERE adapter_position = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertItem(FavoriteRestaurantModel favoriteRestaurantModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteRestaurantModel.insert(favoriteRestaurantModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(FavoriteRestaurantModel favoriteRestaurantModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfFavoriteRestaurantModel.handle(favoriteRestaurantModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeItem(int position) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveItem.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, position);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveItem.release(_stmt);
    }
  }

  @Override
  public List<FavoriteRestaurantModel> getAll() {
    final String _sql = "SELECT * FROM FavoriteRestaurant";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfAdapterPosition = _cursor.getColumnIndexOrThrow("adapter_position");
      final int _cursorIndexOfRestaurantName = _cursor.getColumnIndexOrThrow("restaurant_name");
      final int _cursorIndexOfRestaurantAddress = _cursor.getColumnIndexOrThrow("restaurant_address");
      final int _cursorIndexOfRestaurantImagePath = _cursor.getColumnIndexOrThrow("restaurant_img_path");
      final int _cursorIndexOfIsFavorite = _cursor.getColumnIndexOrThrow("is_favorite");
      final int _cursorIndexOfLatitude = _cursor.getColumnIndexOrThrow("latitude");
      final int _cursorIndexOfLongitude = _cursor.getColumnIndexOrThrow("longitude");
      final List<FavoriteRestaurantModel> _result = new ArrayList<FavoriteRestaurantModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FavoriteRestaurantModel _item;
        _item = new FavoriteRestaurantModel();
        final Long _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getLong(_cursorIndexOfId);
        }
        _item.set_id(_tmp_id);
        final int _tmpAdapterPosition;
        _tmpAdapterPosition = _cursor.getInt(_cursorIndexOfAdapterPosition);
        _item.setAdapterPosition(_tmpAdapterPosition);
        final String _tmpRestaurantName;
        _tmpRestaurantName = _cursor.getString(_cursorIndexOfRestaurantName);
        _item.setRestaurantName(_tmpRestaurantName);
        final String _tmpRestaurantAddress;
        _tmpRestaurantAddress = _cursor.getString(_cursorIndexOfRestaurantAddress);
        _item.setRestaurantAddress(_tmpRestaurantAddress);
        final String _tmpRestaurantImagePath;
        _tmpRestaurantImagePath = _cursor.getString(_cursorIndexOfRestaurantImagePath);
        _item.setRestaurantImagePath(_tmpRestaurantImagePath);
        final Boolean _tmpIsFavorite;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsFavorite)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        }
        _tmpIsFavorite = _tmp == null ? null : _tmp != 0;
        _item.setFavorite(_tmpIsFavorite);
        final Double _tmpLatitude;
        if (_cursor.isNull(_cursorIndexOfLatitude)) {
          _tmpLatitude = null;
        } else {
          _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
        }
        _item.setLatitude(_tmpLatitude);
        final Double _tmpLongitude;
        if (_cursor.isNull(_cursorIndexOfLongitude)) {
          _tmpLongitude = null;
        } else {
          _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
        }
        _item.setLongitude(_tmpLongitude);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
