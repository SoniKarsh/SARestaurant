package restaurant.sa.com.sarestaurant.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import restaurant.sa.com.sarestaurant.model.UserModel;

@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserModel = new EntityInsertionAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User`(`_id`,`emailId`,`mobileNo`,`userName`,`password`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.get_id());
        }
        if (value.getEmailId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmailId());
        }
        if (value.getMobileNo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMobileNo());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
      }
    };
    this.__deletionAdapterOfUserModel = new EntityDeletionOrUpdateAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `User` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.get_id());
        }
      }
    };
    this.__updateAdapterOfUserModel = new EntityDeletionOrUpdateAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `User` SET `_id` = ?,`emailId` = ?,`mobileNo` = ?,`userName` = ?,`password` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.get_id());
        }
        if (value.getEmailId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmailId());
        }
        if (value.getMobileNo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMobileNo());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUserName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        if (value.get_id() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.get_id());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from User";
        return _query;
      }
    };
  }

  @Override
  public void insertData(UserModel userModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserModel.insert(userModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(UserModel userModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserModel.handle(userModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(UserModel userModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserModel.handle(userModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<UserModel> getAll() {
    final String _sql = "SELECT * FROM User";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfEmailId = _cursor.getColumnIndexOrThrow("emailId");
      final int _cursorIndexOfMobileNo = _cursor.getColumnIndexOrThrow("mobileNo");
      final int _cursorIndexOfUserName = _cursor.getColumnIndexOrThrow("userName");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final List<UserModel> _result = new ArrayList<UserModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserModel _item;
        _item = new UserModel();
        final Long _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getLong(_cursorIndexOfId);
        }
        _item.set_id(_tmp_id);
        final String _tmpEmailId;
        _tmpEmailId = _cursor.getString(_cursorIndexOfEmailId);
        _item.setEmailId(_tmpEmailId);
        final String _tmpMobileNo;
        _tmpMobileNo = _cursor.getString(_cursorIndexOfMobileNo);
        _item.setMobileNo(_tmpMobileNo);
        final String _tmpUserName;
        _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        _item.setUserName(_tmpUserName);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        _item.setPassword(_tmpPassword);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public UserModel queryDb(String userName, String password) {
    final String _sql = "SELECT * FROM User WHERE (userName = ? OR emailId = ?) AND password = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (userName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userName);
    }
    _argIndex = 2;
    if (userName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userName);
    }
    _argIndex = 3;
    if (password == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, password);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfEmailId = _cursor.getColumnIndexOrThrow("emailId");
      final int _cursorIndexOfMobileNo = _cursor.getColumnIndexOrThrow("mobileNo");
      final int _cursorIndexOfUserName = _cursor.getColumnIndexOrThrow("userName");
      final int _cursorIndexOfPassword = _cursor.getColumnIndexOrThrow("password");
      final UserModel _result;
      if(_cursor.moveToFirst()) {
        _result = new UserModel();
        final Long _tmp_id;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmp_id = null;
        } else {
          _tmp_id = _cursor.getLong(_cursorIndexOfId);
        }
        _result.set_id(_tmp_id);
        final String _tmpEmailId;
        _tmpEmailId = _cursor.getString(_cursorIndexOfEmailId);
        _result.setEmailId(_tmpEmailId);
        final String _tmpMobileNo;
        _tmpMobileNo = _cursor.getString(_cursorIndexOfMobileNo);
        _result.setMobileNo(_tmpMobileNo);
        final String _tmpUserName;
        _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        _result.setUserName(_tmpUserName);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        _result.setPassword(_tmpPassword);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
