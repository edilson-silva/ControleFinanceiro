package br.com.cf.controller;

import br.com.cf.bean.Usuario;
import br.com.cf.dao.UsuarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarController", urlPatterns = {"/cadastrar"})
public class CadastrarController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("cadastro.jsp");
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

        if (acao.equalsIgnoreCase("cadastrar")) {

            String nome = request.getParameter("nome");
            String nomeUsuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");

            Usuario usuario = new Usuario(nome, nomeUsuario, senha);

            if (UsuarioDao.cadastrar(usuario)) {
                response.sendRedirect("index.jsp");
            }

        } else if (acao.equalsIgnoreCase("cancelar")) {
            response.sendRedirect("index.jsp");
        }
    }

}
