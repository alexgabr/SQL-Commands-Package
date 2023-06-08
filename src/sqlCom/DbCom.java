package sqlCom;

public class DbCom {
    // select
    public static String select(String columns, String table) {
        return "SELECT " + columns + " FROM " + table;
    }

    public static String select(String columns, String table, String where) {
        return "SELECT " + columns + " FROM " + table + " WHERE " + where;
    }

    // insert
    public static String insert(String table, String values) {
        return "INSERT INTO " + table + "VALUES(" + values + ")";
    }

    public static String insert(String table, String columns, String values) {
        return "INSERT INTO " + table + "(" + columns + ")" + " VALUES(" + values + ")";
    }

    // alter table
    public static String rename(String table, String columnName, String newName) {
        return "ALTER TABLE " + table + " RENAME " + columnName + " TO " + newName;
    }

    public static String rename(String table, String columnName, String newName, String where) {
        return "ALTER TABLE " + table + " RENAME " + columnName + " TO " + newName + " WHERE " + where;
    }

    // update
    public static String updateRows(String table, String column, String rowValue, String valueDataType) {
        String ret = "";

        if (valueDataType == "int" || valueDataType == "INT") {
            ret = "UPDATE " + table + " SET " + column + " = " + Integer.parseInt(rowValue);
        } else if (valueDataType == "decimal" || valueDataType == "DECIMAL") {
            ret = "UPDATE " + table + " SET " + column + " = " + Double.parseDouble(rowValue);
        } else if (valueDataType == "date" || valueDataType == "DATE") {
            ret = "UPDATE " + table + " SET " + column + " = " + rowValue;
        } else {
            System.out.println("ERROR");
        }

        return ret;
    }
}