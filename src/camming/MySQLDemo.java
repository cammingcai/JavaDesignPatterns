package camming;
import java.sql.*;
public class MySQLDemo {

	// JDBC �����������ݿ� URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/cammingtest";
 
    // ���ݿ���û��������룬��Ҫ�����Լ�������
    static final String USER = "root";
    static final String PASS = "root";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // ע�� JDBC ����
            Class.forName("com.mysql.jdbc.Driver");
        
            // ������
            System.out.println("�������ݿ�...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // ִ�в�ѯ
            System.out.println(" ʵ����Statement����...");
            stmt = conn.createStatement();
            String sql;
//            sql = "SELECT id, name, url FROM websites";
            sql = "CREATE TABLE `websites` (\r\n" + 
            		"  `id` int(11) NOT NULL AUTO_INCREMENT,\r\n" + 
            		"  `name` char(20) NOT NULL DEFAULT '' COMMENT 'վ������',\r\n" + 
            		"  `url` varchar(255) NOT NULL DEFAULT '',\r\n" + 
            		"  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa ����',\r\n" + 
            		"  `country` char(10) NOT NULL DEFAULT '' COMMENT '����',\r\n" + 
            		"  PRIMARY KEY (`id`)\r\n" + 
            		") ";
            ResultSet rs = stmt.executeQuery(sql);
        
            // չ����������ݿ�
//            while(rs.next()){
//                // ͨ���ֶμ���
//                int id  = rs.getInt("id");
//                String name = rs.getString("name");
//                String url = rs.getString("url");
//    
//                // �������
//                System.out.print("ID: " + id);
//                System.out.print(", վ������: " + name);
//                System.out.print(", վ�� URL: " + url);
//                System.out.print("\n");
//            }
            // ��ɺ�ر�
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // ���� JDBC ����
            se.printStackTrace();
        }catch(Exception e){
            // ���� Class.forName ����
            e.printStackTrace();
        }finally{
            // �ر���Դ
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// ʲô������
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
