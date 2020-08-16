package info.androidhive.sqlite.database.model;

public class Note {
    public static final String TABLE_NAME = "notes";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_NOTE2 = "note2"; //

    private int id;
    private String note;
    private String timestamp;
    private String note2;     //


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NOTE + " TEXT,"
                    + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP,"
                    + COLUMN_NOTE2 + " TEXT"
                    + ")";

    public Note() {
    }

    public Note(int id, String note, String timestamp, String note2) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.note2 = note2;
    }

    public int getId() { return id; }
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
    public String getTimestamp() { return timestamp; }
    public void setId(int id) { this.id = id; }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

  public String getNote2() { return note2; }
  public void setNote2(String note2) { this.note2 = note2; }


}
