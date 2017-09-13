package br.com.cf.controller;

import br.com.cf.dao.UsuarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Index", urlPatterns = {"/index"})
public class IndexController extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("btnAcao");

        if (acao.equalsIgnoreCase("login")) {

            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");

            if (UsuarioDao.login(usuario, senha)) {
                response.sendRedirect("index.jsp");
            }
            response.sendRedirect("index.jsp");
        } else if (acao.equalsIgnoreCase("cadastrar")) {
            response.sendRedirect("cadastro.jsp");
        }
    }
}
