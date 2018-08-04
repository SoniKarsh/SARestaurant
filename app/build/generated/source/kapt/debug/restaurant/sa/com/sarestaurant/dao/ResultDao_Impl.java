package restaurant.sa.com.sarestaurant.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Geometry;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Location;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Northeast;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.OpeningHours;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Photo;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PhotoConverters;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.PlusCode;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Result;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Southwest;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.TypesConverters;
import restaurant.sa.com.sarestaurant.appview.restaurant.model.Viewport;

@SuppressWarnings("unchecked")
public class ResultDao_Impl implements ResultDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfResult;

  private final PhotoConverters __photoConverters = new PhotoConverters();

  private final TypesConverters __typesConverters = new TypesConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ResultDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResult = new EntityInsertionAdapter<Result>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Result`(`_id`,`icon`,`name`,`id`,`photos`,`placeId`,`rating`,`reference`,`scope`,`types`,`vicinity`,`lat`,`lng`,`latitude`,`longitude`,`latitude1`,`longitude2`,`compoundCode`,`globalCode`,`openNow`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Result value) {
        stmt.bindLong(1, value.get_id());
        if (value.getIcon() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIcon());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
        final String _tmp;
        _tmp = __photoConverters.fromImagesJson(value.getPhotos());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getPlaceId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPlaceId());
        }
        if (value.getRating() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getRating());
        }
        if (value.getReference() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReference());
        }
        if (value.getScope() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getScope());
        }
        final String _tmp_1;
        _tmp_1 = __typesConverters.fromImagesJson(value.getTypes());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        if (value.getVicinity() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getVicinity());
        }
        final Geometry _tmpGeometry = value.getGeometry();
        if(_tmpGeometry != null) {
          final Location _tmpLocation = _tmpGeometry.getLocation();
          if(_tmpLocation != null) {
            if (_tmpLocation.getLat() == null) {
              stmt.bindNull(12);
            } else {
              stmt.bindDouble(12, _tmpLocation.getLat());
            }
            if (_tmpLocation.getLng() == null) {
              stmt.bindNull(13);
            } else {
              stmt.bindDouble(13, _tmpLocation.getLng());
            }
          } else {
            stmt.bindNull(12);
            stmt.bindNull(13);
          }
          final Viewport _tmpViewport = _tmpGeometry.getViewport();
          if(_tmpViewport != null) {
            final Northeast _tmpNortheast = _tmpViewport.getNortheast();
            if(_tmpNortheast != null) {
              if (_tmpNortheast.getLat() == null) {
                stmt.bindNull(14);
              } else {
                stmt.bindDouble(14, _tmpNortheast.getLat());
              }
              if (_tmpNortheast.getLng() == null) {
                stmt.bindNull(15);
              } else {
                stmt.bindDouble(15, _tmpNortheast.getLng());
              }
            } else {
              stmt.bindNull(14);
              stmt.bindNull(15);
            }
            final Southwest _tmpSouthwest = _tmpViewport.getSouthwest();
            if(_tmpSouthwest != null) {
              if (_tmpSouthwest.getLat() == null) {
                stmt.bindNull(16);
              } else {
                stmt.bindDouble(16, _tmpSouthwest.getLat());
              }
              if (_tmpSouthwest.getLng() == null) {
                stmt.bindNull(17);
              } else {
                stmt.bindDouble(17, _tmpSouthwest.getLng());
              }
            } else {
              stmt.bindNull(16);
              stmt.bindNull(17);
            }
          } else {
            stmt.bindNull(14);
            stmt.bindNull(15);
            stmt.bindNull(16);
            stmt.bindNull(17);
          }
        } else {
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
        }
        final PlusCode _tmpPlusCode = value.getPlusCode();
        if(_tmpPlusCode != null) {
          if (_tmpPlusCode.getCompoundCode() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpPlusCode.getCompoundCode());
          }
          if (_tmpPlusCode.getGlobalCode() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpPlusCode.getGlobalCode());
          }
        } else {
          stmt.bindNull(18);
          stmt.bindNull(19);
        }
        final OpeningHours _tmpOpeningHours = value.getOpeningHours();
        if(_tmpOpeningHours != null) {
          final Integer _tmp_2;
          _tmp_2 = _tmpOpeningHours.getOpenNow() == null ? null : (_tmpOpeningHours.getOpenNow() ? 1 : 0);
          if (_tmp_2 == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindLong(20, _tmp_2);
          }
        } else {
          stmt.bindNull(20);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from Result";
        return _query;
      }
    };
  }

  @Override
  public void insertData(Result result) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfResult.insert(result);
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
  public List<Result> loadAllUsersByPage(int limit, int offset) {
    final String _sql = "SELECT * FROM Result LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIcon = _cursor.getColumnIndexOrThrow("icon");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfPhotos = _cursor.getColumnIndexOrThrow("photos");
      final int _cursorIndexOfPlaceId = _cursor.getColumnIndexOrThrow("placeId");
      final int _cursorIndexOfRating = _cursor.getColumnIndexOrThrow("rating");
      final int _cursorIndexOfReference = _cursor.getColumnIndexOrThrow("reference");
      final int _cursorIndexOfScope = _cursor.getColumnIndexOrThrow("scope");
      final int _cursorIndexOfTypes = _cursor.getColumnIndexOrThrow("types");
      final int _cursorIndexOfVicinity = _cursor.getColumnIndexOrThrow("vicinity");
      final int _cursorIndexOfLat = _cursor.getColumnIndexOrThrow("lat");
      final int _cursorIndexOfLng = _cursor.getColumnIndexOrThrow("lng");
      final int _cursorIndexOfLat_1 = _cursor.getColumnIndexOrThrow("latitude");
      final int _cursorIndexOfLng_1 = _cursor.getColumnIndexOrThrow("longitude");
      final int _cursorIndexOfLat_2 = _cursor.getColumnIndexOrThrow("latitude1");
      final int _cursorIndexOfLng_2 = _cursor.getColumnIndexOrThrow("longitude2");
      final int _cursorIndexOfCompoundCode = _cursor.getColumnIndexOrThrow("compoundCode");
      final int _cursorIndexOfGlobalCode = _cursor.getColumnIndexOrThrow("globalCode");
      final int _cursorIndexOfOpenNow = _cursor.getColumnIndexOrThrow("openNow");
      final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Result _item;
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        final String _tmpIcon;
        _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        final List<Photo> _tmpPhotos;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfPhotos);
        _tmpPhotos = __photoConverters.toImagesList(_tmp);
        final String _tmpPlaceId;
        _tmpPlaceId = _cursor.getString(_cursorIndexOfPlaceId);
        final Double _tmpRating;
        if (_cursor.isNull(_cursorIndexOfRating)) {
          _tmpRating = null;
        } else {
          _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
        }
        final String _tmpReference;
        _tmpReference = _cursor.getString(_cursorIndexOfReference);
        final String _tmpScope;
        _tmpScope = _cursor.getString(_cursorIndexOfScope);
        final List<String> _tmpTypes;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfTypes);
        _tmpTypes = __typesConverters.toImagesList(_tmp_1);
        final String _tmpVicinity;
        _tmpVicinity = _cursor.getString(_cursorIndexOfVicinity);
        final Geometry _tmpGeometry;
        if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1) && _cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
          final Location _tmpLocation;
          if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng))) {
            final Double _tmpLat;
            if (_cursor.isNull(_cursorIndexOfLat)) {
              _tmpLat = null;
            } else {
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            }
            final Double _tmpLng;
            if (_cursor.isNull(_cursorIndexOfLng)) {
              _tmpLng = null;
            } else {
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
            }
            _tmpLocation = new Location(_tmpLat,_tmpLng);
          }  else  {
            _tmpLocation = null;
          }
          final Viewport _tmpViewport;
          if (! (_cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1) && _cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
            final Northeast _tmpNortheast;
            if (! (_cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1))) {
              final Double _tmpLat_1;
              if (_cursor.isNull(_cursorIndexOfLat_1)) {
                _tmpLat_1 = null;
              } else {
                _tmpLat_1 = _cursor.getDouble(_cursorIndexOfLat_1);
              }
              final Double _tmpLng_1;
              if (_cursor.isNull(_cursorIndexOfLng_1)) {
                _tmpLng_1 = null;
              } else {
                _tmpLng_1 = _cursor.getDouble(_cursorIndexOfLng_1);
              }
              _tmpNortheast = new Northeast(_tmpLat_1,_tmpLng_1);
            }  else  {
              _tmpNortheast = null;
            }
            final Southwest _tmpSouthwest;
            if (! (_cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
              final Double _tmpLat_2;
              if (_cursor.isNull(_cursorIndexOfLat_2)) {
                _tmpLat_2 = null;
              } else {
                _tmpLat_2 = _cursor.getDouble(_cursorIndexOfLat_2);
              }
              final Double _tmpLng_2;
              if (_cursor.isNull(_cursorIndexOfLng_2)) {
                _tmpLng_2 = null;
              } else {
                _tmpLng_2 = _cursor.getDouble(_cursorIndexOfLng_2);
              }
              _tmpSouthwest = new Southwest(_tmpLat_2,_tmpLng_2);
            }  else  {
              _tmpSouthwest = null;
            }
            _tmpViewport = new Viewport(_tmpNortheast,_tmpSouthwest);
          }  else  {
            _tmpViewport = null;
          }
          _tmpGeometry = new Geometry(_tmpLocation,_tmpViewport);
        }  else  {
          _tmpGeometry = null;
        }
        final PlusCode _tmpPlusCode;
        if (! (_cursor.isNull(_cursorIndexOfCompoundCode) && _cursor.isNull(_cursorIndexOfGlobalCode))) {
          final String _tmpCompoundCode;
          _tmpCompoundCode = _cursor.getString(_cursorIndexOfCompoundCode);
          final String _tmpGlobalCode;
          _tmpGlobalCode = _cursor.getString(_cursorIndexOfGlobalCode);
          _tmpPlusCode = new PlusCode(_tmpCompoundCode,_tmpGlobalCode);
        }  else  {
          _tmpPlusCode = null;
        }
        final OpeningHours _tmpOpeningHours;
        if (! (_cursor.isNull(_cursorIndexOfOpenNow))) {
          final Boolean _tmpOpenNow;
          final Integer _tmp_2;
          if (_cursor.isNull(_cursorIndexOfOpenNow)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _cursor.getInt(_cursorIndexOfOpenNow);
          }
          _tmpOpenNow = _tmp_2 == null ? null : _tmp_2 != 0;
          _tmpOpeningHours = new OpeningHours(_tmpOpenNow);
        }  else  {
          _tmpOpeningHours = null;
        }
        _item = new Result(_tmp_id,_tmpGeometry,_tmpIcon,_tmpName,_tmpId,_tmpPhotos,_tmpPlaceId,_tmpPlusCode,_tmpOpeningHours,_tmpRating,_tmpReference,_tmpScope,_tmpTypes,_tmpVicinity);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Result> getAll() {
    final String _sql = "SELECT * FROM Result";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIcon = _cursor.getColumnIndexOrThrow("icon");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfPhotos = _cursor.getColumnIndexOrThrow("photos");
      final int _cursorIndexOfPlaceId = _cursor.getColumnIndexOrThrow("placeId");
      final int _cursorIndexOfRating = _cursor.getColumnIndexOrThrow("rating");
      final int _cursorIndexOfReference = _cursor.getColumnIndexOrThrow("reference");
      final int _cursorIndexOfScope = _cursor.getColumnIndexOrThrow("scope");
      final int _cursorIndexOfTypes = _cursor.getColumnIndexOrThrow("types");
      final int _cursorIndexOfVicinity = _cursor.getColumnIndexOrThrow("vicinity");
      final int _cursorIndexOfLat = _cursor.getColumnIndexOrThrow("lat");
      final int _cursorIndexOfLng = _cursor.getColumnIndexOrThrow("lng");
      final int _cursorIndexOfLat_1 = _cursor.getColumnIndexOrThrow("latitude");
      final int _cursorIndexOfLng_1 = _cursor.getColumnIndexOrThrow("longitude");
      final int _cursorIndexOfLat_2 = _cursor.getColumnIndexOrThrow("latitude1");
      final int _cursorIndexOfLng_2 = _cursor.getColumnIndexOrThrow("longitude2");
      final int _cursorIndexOfCompoundCode = _cursor.getColumnIndexOrThrow("compoundCode");
      final int _cursorIndexOfGlobalCode = _cursor.getColumnIndexOrThrow("globalCode");
      final int _cursorIndexOfOpenNow = _cursor.getColumnIndexOrThrow("openNow");
      final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Result _item;
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        final String _tmpIcon;
        _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        final List<Photo> _tmpPhotos;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfPhotos);
        _tmpPhotos = __photoConverters.toImagesList(_tmp);
        final String _tmpPlaceId;
        _tmpPlaceId = _cursor.getString(_cursorIndexOfPlaceId);
        final Double _tmpRating;
        if (_cursor.isNull(_cursorIndexOfRating)) {
          _tmpRating = null;
        } else {
          _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
        }
        final String _tmpReference;
        _tmpReference = _cursor.getString(_cursorIndexOfReference);
        final String _tmpScope;
        _tmpScope = _cursor.getString(_cursorIndexOfScope);
        final List<String> _tmpTypes;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfTypes);
        _tmpTypes = __typesConverters.toImagesList(_tmp_1);
        final String _tmpVicinity;
        _tmpVicinity = _cursor.getString(_cursorIndexOfVicinity);
        final Geometry _tmpGeometry;
        if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1) && _cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
          final Location _tmpLocation;
          if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng))) {
            final Double _tmpLat;
            if (_cursor.isNull(_cursorIndexOfLat)) {
              _tmpLat = null;
            } else {
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
            }
            final Double _tmpLng;
            if (_cursor.isNull(_cursorIndexOfLng)) {
              _tmpLng = null;
            } else {
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
            }
            _tmpLocation = new Location(_tmpLat,_tmpLng);
          }  else  {
            _tmpLocation = null;
          }
          final Viewport _tmpViewport;
          if (! (_cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1) && _cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
            final Northeast _tmpNortheast;
            if (! (_cursor.isNull(_cursorIndexOfLat_1) && _cursor.isNull(_cursorIndexOfLng_1))) {
              final Double _tmpLat_1;
              if (_cursor.isNull(_cursorIndexOfLat_1)) {
                _tmpLat_1 = null;
              } else {
                _tmpLat_1 = _cursor.getDouble(_cursorIndexOfLat_1);
              }
              final Double _tmpLng_1;
              if (_cursor.isNull(_cursorIndexOfLng_1)) {
                _tmpLng_1 = null;
              } else {
                _tmpLng_1 = _cursor.getDouble(_cursorIndexOfLng_1);
              }
              _tmpNortheast = new Northeast(_tmpLat_1,_tmpLng_1);
            }  else  {
              _tmpNortheast = null;
            }
            final Southwest _tmpSouthwest;
            if (! (_cursor.isNull(_cursorIndexOfLat_2) && _cursor.isNull(_cursorIndexOfLng_2))) {
              final Double _tmpLat_2;
              if (_cursor.isNull(_cursorIndexOfLat_2)) {
                _tmpLat_2 = null;
              } else {
                _tmpLat_2 = _cursor.getDouble(_cursorIndexOfLat_2);
              }
              final Double _tmpLng_2;
              if (_cursor.isNull(_cursorIndexOfLng_2)) {
                _tmpLng_2 = null;
              } else {
                _tmpLng_2 = _cursor.getDouble(_cursorIndexOfLng_2);
              }
              _tmpSouthwest = new Southwest(_tmpLat_2,_tmpLng_2);
            }  else  {
              _tmpSouthwest = null;
            }
            _tmpViewport = new Viewport(_tmpNortheast,_tmpSouthwest);
          }  else  {
            _tmpViewport = null;
          }
          _tmpGeometry = new Geometry(_tmpLocation,_tmpViewport);
        }  else  {
          _tmpGeometry = null;
        }
        final PlusCode _tmpPlusCode;
        if (! (_cursor.isNull(_cursorIndexOfCompoundCode) && _cursor.isNull(_cursorIndexOfGlobalCode))) {
          final String _tmpCompoundCode;
          _tmpCompoundCode = _cursor.getString(_cursorIndexOfCompoundCode);
          final String _tmpGlobalCode;
          _tmpGlobalCode = _cursor.getString(_cursorIndexOfGlobalCode);
          _tmpPlusCode = new PlusCode(_tmpCompoundCode,_tmpGlobalCode);
        }  else  {
          _tmpPlusCode = null;
        }
        final OpeningHours _tmpOpeningHours;
        if (! (_cursor.isNull(_cursorIndexOfOpenNow))) {
          final Boolean _tmpOpenNow;
          final Integer _tmp_2;
          if (_cursor.isNull(_cursorIndexOfOpenNow)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _cursor.getInt(_cursorIndexOfOpenNow);
          }
          _tmpOpenNow = _tmp_2 == null ? null : _tmp_2 != 0;
          _tmpOpeningHours = new OpeningHours(_tmpOpenNow);
        }  else  {
          _tmpOpeningHours = null;
        }
        _item = new Result(_tmp_id,_tmpGeometry,_tmpIcon,_tmpName,_tmpId,_tmpPhotos,_tmpPlaceId,_tmpPlusCode,_tmpOpeningHours,_tmpRating,_tmpReference,_tmpScope,_tmpTypes,_tmpVicinity);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
