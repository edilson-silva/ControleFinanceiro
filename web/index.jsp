<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" http-equiv="Content-Type" content="text/html">
        <title>Home</title>
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/index.css"/>
    </head>
    <body>
        <div id="d_frm_login">
            <form id="frm_login" action="login" method="POST">
                <table>
                    <thead>
                        <tr>
                            <td colspan="2">Controle<span>Financeiro</span></td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="leftTitle">Usuário</td>
                            <td><input type="text" name="inpEmail"/></td>
                        </tr>
                        <tr>
                            <td class="leftTitle">Senha</td>
                            <td><input type="password" name="inpSenha"/></td>
                        </tr>
                        <tr>
                            <td><input type="submit" name="btnAcao" value="Login"/></td>
                            <td><input type="submit" name="btnAcao" value="Cadastrar"/></td>
                        </tr>
                    </tbody>
                </table>

            </form>
        </div>
    </body>
</html>
