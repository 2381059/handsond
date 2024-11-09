package repositories;


import com.sun.source.tree.TryTree;

public class TodoListRepositoryDblmpl {




    @Override
    public Todolist[] getAll() {
        Connection connection = database.getConnection();
        String sqlStatament = "SELECT * FROM todos";
        List<TodoList> todoList = new ArrayList<>();
        Try {
            PreparedStatement preparedstatement = connection.preparedStatement(sqlStatement);
            ResultSet resulSet = preparedStatement.executeQuery();
            while (resultSet.nex()) {
                TodoList todoList = new TodoList();
                Integer
            }
 void Add ( final TodoList todoList){

                String
            }
        }
    }            @Override
    public
    private Integer getDbld(final Integer number) {
        TodoList[] todoList = getAll();
        Long count









    }
    @Override






















