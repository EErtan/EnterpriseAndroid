package com.nullcognition.enterpriseandroid;
public final class KeyValContract {

  private KeyValContract(){}

  public static final  int             VERSION      = 1;
  public static final  String          AUTHORITY    = "com.enterpriseandroid.database.keyval";
  private static final android.net.Uri URI_BASE     = new android.net.Uri.Builder().scheme(android.content.ContentResolver.SCHEME_CONTENT)
																				   .authority(AUTHORITY).build();
  public static final  String          TABLE_VALS   = "vals";
  public static final  android.net.Uri URI_VALS     = URI_BASE.buildUpon().appendPath(TABLE_VALS).build();
  public static final  String          TYPE_VALS    = android.content.ContentResolver.CURSOR_DIR_BASE_TYPE +  "/vnd.com.enterpriseandroid.database.val";
  public static final  String          TYPE_VAL     = android.content.ContentResolver.CURSOR_ITEM_BASE_TYPE + "/vnd.com.enterpriseandroid.database.val";
  public static final  String          TABLE_KEYVAL = "keyval";
  public static final  android.net.Uri URI_KEYVAL   = URI_BASE.buildUpon().appendPath(TABLE_KEYVAL).build();
  public static final  String          TYPE_KEYVALS = android.content.ContentResolver.CURSOR_DIR_BASE_TYPE +  "/vnd.com.enterpriseandroid.database.keyval";
  public static final  String          TYPE_KEYVAL  = android.content.ContentResolver.CURSOR_ITEM_BASE_TYPE + "/vnd.com.enterpriseandroid.database.keyval";

  public static final class Columns {

	private Columns(){}

	// vals table columns
	public static final String ID    = android.provider.BaseColumns._ID;
	public static final String VAL   = "val";
	// the keyval table has the following columns,
// in addition to those above
	public static final String KEY   = "key";
	public static final String EXTRA = "extra";
  }

  public static final class Permission {

	private Permission(){}

	public static final String READ  = "com.enterpriseandroid.database.keyval.READ";
	public static final String WRITE = "com.enterpriseandroid.database.keyval.WRITE";
  }
}
