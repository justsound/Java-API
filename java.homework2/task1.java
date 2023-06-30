// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} select * from students where 'name=Ivanov' and 'country=Russia' and...

public class task1 {
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String sql = createSql(json);
        System.out.println(sql);
        
    }

    private static String createSql(String json) {
        String[] values = json.replace("{", "").replace("}", "").split(",");
        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        Boolean addAnd = false;
        for (int i = 0; i < values.length; i ++) {
            String[] value = values[i].replace("\"", "").replace(" ", "").split(":");
            if (!value[1].equals("null")) {
                if (addAnd) { stringBuilder.append(" AND "); }
                stringBuilder.append(value[0]).append(" = \"").append(value[1]).append("\"");
                addAnd = true;
            }
        }
        return stringBuilder.toString();
    }

}