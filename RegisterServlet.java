package servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@WebServlet("/RegisterServlet")  
public class RegisterServlet extends HttpServlet {  
    private static final long serialVersionUID = 1L;  
         
    /** 
     * @see HttpServlet#HttpServlet() 
     */  
    public RegisterServlet() {  
        super();
    }  
  
    /** 
     * http://localhost:8080/ServletTest/RegisterServlet?
     * X=6833&Y=123456&Z=166&Alpha=10.08&Beta=10.08&Gamma=10.08&
     * J1_Tor=10.08&J2_Tor=10.08&J3_Tor=10.08&J4_Tor=10.08&J5_Tor=10.08&J6_Tor=10.08&J7_Tor=10.08
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
     */  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  

        String X = request.getParameter("X"); // �� request �л�ȡ��Ϊ X �Ĳ�����ֵ  
        String Y = request.getParameter("Y"); // �� request �л�ȡ��Ϊ Y �Ĳ�����ֵ  
        String Z = request.getParameter("Z"); // �� request �л�ȡ��Ϊ Y �Ĳ�����ֵ 
        String Alpha = request.getParameter("Alpha"); // �� request �л�ȡ��Ϊ Alpha �Ĳ�����ֵ  
        String Beta = request.getParameter("Beta"); // �� request �л�ȡ��ΪBeta �Ĳ�����ֵ  
        String Gamma = request.getParameter("Gamma"); // �� request �л�ȡ��Ϊ Gamma �Ĳ�����ֵ 
        
        String J1_Tor = request.getParameter("J1_Tor"); // �� request �л�ȡ��ΪJ1_Tor�Ĳ�����ֵ  
        String J2_Tor = request.getParameter("J2_Tor"); // �� request �л�ȡ��ΪJ2_Tor�Ĳ�����ֵ  
        String J3_Tor = request.getParameter("J3_Tor"); // �� request �л�ȡ��ΪJ3_Tor�Ĳ�����ֵ  
        String J4_Tor = request.getParameter("J4_Tor"); // �� request �л�ȡ��ΪJ4_Tor�Ĳ�����ֵ  
        String J5_Tor = request.getParameter("J5_Tor"); // �� request �л�ȡ��ΪJ5_Tor�Ĳ�����ֵ   
        String J6_Tor = request.getParameter("J6_Tor"); // �� request �л�ȡ��ΪJ6_Tor�Ĳ�����ֵ  
        String J7_Tor = request.getParameter("J7_Tor"); // �� request �л�ȡ��ΪJ7_Tor�Ĳ�����ֵ  
        
        System.out.println("X:" + X + "\nY:" + Y + "\nZ:" + Z + 
        		"\nAlpha:" + Alpha + "\nBeta:" + Beta + "\nGamma:" + Gamma+ 
        		"\nJ1_Tor:" + J1_Tor+ "\nJ2_Tor:" + J2_Tor+ "\nJ3_Tor:" + J3_Tor+ "\nJ4_Tor:" + 
        		J4_Tor+ "\nJ5_Tor:" + J5_Tor+ "\nJ6_Tor:" + J6_Tor+ "\nJ7_Tor:" + J7_Tor); // ��ӡ������һ��  
        
/*        String resCode = "";
        String resMsg = "";
        String userId = "";*/
          
          
        //����Ϊһ����򵥵����ݴ洢��mysql���ݿ��demo
        try {
            Connection connect = DBUtil.getConnect();  
            Statement statement = (Statement) connect.createStatement(); // Statement�������Ϊ���ݿ����ʵ���������ݿ�����в�����ͨ������ʵ��  
            String sqlInsertData = "insert into " + DBUtil.TABLE_XY + 
                "(X,Y,Z,Alpha,Beta,Gamma,J1_Tor,J2_Tor,J3_Tor,J4_Tor,J5_Tor,J6_Tor,J7_Tor) values('" + 
                X + "','" + Y + "','" + Z + "','" + Alpha + "','" + Beta + "','" + Gamma + "','" + 
                J1_Tor + "','" + J2_Tor + "','" + J3_Tor + "','" + J4_Tor + "','" + J5_Tor + "','" + J6_Tor + "','" + J7_Tor + "')";  
                // �������������һ��int���͵�ֵ������ò���Ӱ�쵽������  
                int row1 = statement.executeUpdate(sqlInsertData); // ����������mysql���ݿ� 
                System.out.println(row1);

        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
          
/*        HashMap<String, String> map = new HashMap<String, String>();  
        map.put("resCode", resCode);  
        map.put("resMsg", resMsg);  
        map.put("userId", userId);  
          
        response.setContentType("text/html;charset=utf-8"); // ������Ӧ���ĵı����ʽ  
        PrintWriter pw = response.getWriter(); // ��ȡ response �������  
        pw.println(map.toString()); // ͨ���������ҵ���߼��Ľ�����  
        pw.flush();  */
    }  
  
    /** 
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
     */  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        doGet(request, response);  
    }  
  
}
