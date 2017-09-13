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
                            <th colspan="2">Controle<span>Financeiro</span></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="tdLeft">Usuário</td>
                            <td class="tdRight"><input type="text" name="usuario" minlength="8" maxlength="30"/></td>
                        </tr>
                        <tr>
                            <td class="tdLeft">Senha</td>
                            <td class="tdRight" ><input type="password" name="senha" minlength="8" maxlength="20"/></td>
                        </tr>
                        <tr>
                            <td class="tdRight" colspan="2">
                                <input class="btnLogin" type="submit" name="btnAcao" value="Login"/>
                                <input class="btnCadastrar" type="submit" name="btnAcao" value="Cadastrar"/>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
