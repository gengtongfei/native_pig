<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/24
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>无标题文档</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/GetPwd.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="<%=request.getContextPath()%>/index.jsp"><img src="<%=request.getContextPath()%>/images/logo.gif"
                                                               alt="Estimation" width="255" height="58" border="0"
                                                               class="logo"/></a>

        <p class="topDiv"></p>

        <p class="navLeft"></p>
        <ul>
            <li><a href="<%=request.getContextPath()%>/index.jsp" class="hover">首页</a></li>
            <li><a href="<%=request.getContextPath()%>/#">关于我们</a></li>
            <li><a href="<%=request.getContextPath()%>/#">在线客服</a></li>
            <li class="chart"><a href="<%=request.getContextPath()%>/chart.jsp">购物车</a></li>
        </ul>
        <p class="navRight"></p>

        <p class="topDiv"></p>

        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
            <input type="submit" name="go" value="搜" class="go"/>
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div class="nav">
        <ul>
            <li class="first"><a href="<%=request.getContextPath()%>/#">新品上架</a></li>
            <li><a href="<%=request.getContextPath()%>/#">坚果炒货</a></li>
            <li><a href="<%=request.getContextPath()%>/#">补血大枣</a></li>
            <li><a href="<%=request.getContextPath()%>/#">经典肉类</a></li>
            <li><a href="<%=request.getContextPath()%>/#">进口零食</a></li>
            <li><a href="<%=request.getContextPath()%>/#">美味糖果</a></li>
            <li><a href="<%=request.getContextPath()%>/#">天然干果</a></li>
            <li><a href="<%=request.getContextPath()%>/#">蒙古奶酪</a></li>
            <li><a href="<%=request.getContextPath()%>/#">台湾牛轧糖</a></li>
            <li><a href="<%=request.getContextPath()%>/#">蜜饯果脯</a></li>
            <li class="last">
                <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a
                        href="<%=request.getContextPath()%>/login.jsp">登录</a><span
                        class="Lloginfg">&nbsp;</span><a href="<%=request.getContextPath()%>/reg.jsp">注册</a></div>
            </li>
        </ul>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=request.getContextPath()%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="<%=request.getContextPath()%>/#"/>
            <area shape="rect" coords="540,12,633,51" href="<%=request.getContextPath()%>/#"/>
            <area shape="rect" coords="684,12,790,53" href="<%=request.getContextPath()%>/#"/>
            <area shape="rect" coords="830,10,953,54" href="<%=request.getContextPath()%>/#"/>
        </map>
    </div>
    <!--guide01 end -->
    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left" style="width:490px;"><span class="h1"><img
                    src="<%=request.getContextPath()%>/images/buttonPassword.gif"
                    alt="找回密码"/></span></h1>

            <div class="Emai">
                <div class="dlTitle">
                </div>
                <div class="dlContent">
                    <div class="dlContentC">
                        <p class="colSty1"> 请输入您在注册时使用的Email地址：</p>

                        <p class="hideMsg2" id="emailErrMsg"></p>

                        <p class="pSty1B pSty2B"> 请填写您的Email地址：
                            <input name="txtM2Email" id="txtM2Email" maxlength="128" type="text"/>
                            <input name="hiddenUserIDAndEmail" id="hiddenUserIDAndEmail" type="hidden"/>
                        </p>
                        <!-- onchange="EmailGetPwd(false);"-->
                        <p class="pSty1B" align="right"><a href="<%=request.getContextPath()%>/GetPwd2.jsp"><img
                                src="<%=request.getContextPath()%>/images/button_next.gif"
                                border="0"/></a></p>

                        <p class="pSty4">如果该电子邮箱地址不正确，或者您已经忘记注册时填写的邮箱地址，那我们无法帮您找回密码，建议创建一个新帐户。</p>

                        <p class="pSty7 color3" style="margin-top:20px;">如果有任何疑问，请访问口口香<a
                                href="<%=request.getContextPath()%>/#"
                                target="_blank">帮助中心</a>，或与口口香客服部取得联系。
                        </p>

                        <p class="pSty7">客服邮箱：service@koukouxiang.com</p>

                        <p class="pSty7">客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)</p>

                        <p class="pSty7">客服传真：0315-83607020</p>
                    </div>
                </div>
            </div>
        </div>
        <br class="spacer"/>
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="<%=request.getContextPath()%>/#">首页</a>|</li>
            <li><a href="<%=request.getContextPath()%>/#">关于我们</a>|</li>
            <li><a href="<%=request.getContextPath()%>/#">新闻资讯</a>|</li>
            <li><a href="<%=request.getContextPath()%>/#">价单下载</a>|</li>
            <li><a href="<%=request.getContextPath()%>/#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>

        <p class="design"><a href="<%=request.getContextPath()%>/http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a>
        </p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>
