<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>首页</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            getProvinceList();
            $("#provincesAList").click(function () {
                getProvinceList();
            })
        })

        function getProvinceList(){
            $.ajax({
                url:"queryAllProvinces.do",
                success:function (resp) {
                    $("#provincesAList").empty();
                    $.each(resp.data, function (i, n) {
                        $("#provincesAList").append("<option value='" + n.id + "'>" + n.name + "</optipon>");
                    })
                },
                dataType:"json"
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table>
            <tr>
                <td>省份列表</td>
                <td>
                    <select id="provincesAList">
                        <option value="0">请选择</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>城市名称</td>
                <td>
                    <input type="text" id="cityName">
                </td>
            </tr>

            <tr>
                <td>
                    <input type="button" id="addCity" value="添加城市">
                </td>
                <td>
                    <input type="button" id="showCity" value="查询省份的城市">
                </td>
            </tr>
        </table>
        <br>
        <div id="dataDiv">
            <table>
                <thead>
                <tr>
                    <td>城市id</td>
                    <td>城市名称</td>
                </tr>
                </thead>

                <tbody id="dataInfo">

                </tbody>
            </table>
        </div>
    </div>
</body>
</html>