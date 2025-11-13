package login;
//importação de bibliotecas de banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Criação de classe publica User, armazenando conexão para URL que 
//conecta ao banco test
//Objeto Connection é usado para executar comandos SQL
public class User {
    public Connection conectarBD () {
        Connection conn = null;
        try {
            Class.forName("com.mysql.DriverManager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e) { }
        return conn;}
    public String nome="";
    public boolean result = false;

    //Abre conexão com banco
    //Query SQL é montada, para buscar nome do usuario
    public boolean verificarUsuario (String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        //SQL é executado atraves do objeto Statement
        //Obtem resultado de ResultSet atraves de executeQuery(sql)
        //Login e senha são validos, quando ResultSet tiver rs.next() nas suas linhas
        //Usuario existe = true, usuario não existe = false 
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                result = true;
                nome = rs.getString("nome");}
        }catch (Exception e) { }
        return result; }  
    }//fim da class
