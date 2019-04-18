<%--
  Created by IntelliJ IDEA.
  User: Fisseha
  Date: 4/17/2019
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ page import="wap.mum.cs.model.Quiz" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title> Number Quiz </title>
        <style>
            body{
               margin: 20px;
            }
            div.content{
                width: 400px;
                padding-left: 20px;
                padding-right: 20px;
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <div class = "content">
            <h2> Number Quiz </h2>
            <%! Quiz quiz;%>
            <%quiz = (Quiz)session.getAttribute("quiz"); %>
            <form action = "NumberQuiz" method="post">
                <p> Your current score is

                    <%= quiz.getScore()%>.
                    Index = <%= quiz.getIndex()%>
                </p>
                <P> Guess the next number.</P>
                <p> <%= quiz.getQuestion()[quiz.getIndex()]%> </p>
                <p> <label>Your answer: <input type = "text" name = "answer" size = "5"></label></p>
                <p> <input type = "submit" value = "Submit"> </p>
            </form>
        </div>
    </body>
</html>
