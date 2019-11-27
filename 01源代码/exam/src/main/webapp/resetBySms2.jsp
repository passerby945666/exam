
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码2</title>
</head>
<body>
<div >
    <div style="text-align: center">
        <h3>忘记密码了怎么办——2、修改密码</h3>
    </div>
    <div style=" position: absolute;border: 1px solid #333333;border-radius: 5px ;padding-left:100px;padding-top:20px;padding-bottom: 20px;margin-left: 15%;width: 400px">
        <form action="/stu/forgetStuPassword2" method="post">
            <table style="text-align-last: left">
                <tr>
                    <th>密码：</th>
                    <th><input type="text" PLACEHOLDER="请输入您的新密码" required name="sPassword"></th>
                </tr>
                <tr>
                    <th>确认密码：</th>
                    <th><input type="text" PLACEHOLDER="请再次确认您的新密码" required name="csPassword"></th>
                </tr>
            </table>
            <br>
            <div style="float: left;">
                <button type="submit" >确认修改</button>
                <input style="cursor:pointer" onclick="javascript:window.open('/login.jsp','_self')" type="button" value="返回">
            </div>
            <div style="float: right;margin-right: 20px">
                <span>${smg}</span>
            </div>
        </form>
    </div>
    </form>
</div>
</body>
</html>



