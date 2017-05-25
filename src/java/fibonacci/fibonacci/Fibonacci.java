/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.fibonacci;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author tiago.lucas
 */
public class Fibonacci extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        int aux=0;
        int j=1;
        System.out.println(j);
        for(int i=1;i<=30;i++){
            int k=j;
            j=aux+j;
            aux=k;
            System.out.println(j);
        }
        System.out.println(fibonacci(1));
    }
    private int fibonacci(int a){
        int aux=0;
        int j=1;
        //System.out.println(j);
        for(int i=1;i<a;i++){
            int k=j;
            j=aux+j;
            aux=k;
            //System.out.println(j);
        }
        return j;
    }
    
}
