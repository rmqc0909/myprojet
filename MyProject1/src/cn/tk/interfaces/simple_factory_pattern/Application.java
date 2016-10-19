package cn.tk.interfaces.simple_factory_pattern;

import java.sql.*;

/**
 * Created by xiedan11 on 2016/10/12.
 * �򵥹���ģʽ��JDK������͵�Ӧ��Ҫ��JDBC�ˡ�
 * ���԰ѹ�ϵ�����ݿ���Ϊ��һ�ֳ����Ʒ���������ṩ�ľ����ϵ�����ݿ⣨MySQL��PostgreSQL��Oracle�����Ǿ����Ʒ��
 * DriverManager�ǹ����ࡣ
 * Ӧ�ó���ͨ��JDBC�ӿ�ʹ�ù�ϵ�����ݿ�ʱ��������Ҫ���ľ���ʹ�õ����������ݿ⣬��ֱ��ʹ��DriverManager�ľ�̬����ȥ�õ������ݿ��Connection��
 */
public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName ("org.apache.hive.jdbc.HiveDriver");
        connection = DriverManager.getConnection ("jdbc:hive2://127.0.0.1:10000/default");
        PreparedStatement preparedStatement = connection.prepareStatement ("select count(*) from test");
        preparedStatement.execute ();
    }
}
