<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head lang="pt-BR">
        <meta charset="UTF-8" http-equiv="Content-Type" content="text/html"/>
        <title>Cadastrar-se</title>
        <link rel="shortcut icon" type="image/png" href="imagens/favicon.png"/>
        <link rel="stylesheet" type="text/css" href="css/cadastrar.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <form id="frmCadastrar" action="cadastrar" method="POST">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">Dados <span>Pessoais</span></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="tdLeft">Nome</td>
                        <td class="tdRight"><input type="text" name="nome" minlength="8" maxlength="30"/></td>
                    </tr>
                    <tr>
                        <td class="tdLeft">Usuario</td>
                        <td class="tdRight"><input type="text" name="usuario" minlength="8" maxlength="30"/></td>
                    </tr>
                    <tr>
                        <td class="tdLeft">Senha</td>
                        <td class="tdRight"><input type="password" name="senha" minlength="8" maxlength="20"/></td>
                    </tr>
                    <tr>
                        <td class="tdRight" colspan="2">
                            <input class="btnCadastrar" type="submit" name="btnAcao" value="Cadastrar"/>
                            <input class="btnCancelar" type="submit" name="btnAcao" value="Cancelar"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
