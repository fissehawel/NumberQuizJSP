package wap.mum.cs.controller;

import wap.mum.cs.model.Quiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ControllerServlet", urlPatterns = {"/NumberQuiz"})

public class ControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Quiz quiz = (Quiz) request.getSession().getAttribute("quiz");
        if(quiz.getIndex() == 4){

            int ans = Integer.valueOf(request.getParameter("answer"));
            if(ans == quiz.getAnswer()[quiz.getIndex()]) {
                quiz.updateScore(1);
            }
            request.getRequestDispatcher("result.jsp").forward(request, response);

        } else{
            int ans = Integer.valueOf(request.getParameter("answer"));
            if(ans == quiz.getAnswer()[quiz.getIndex()]) {
                quiz.updateScore(1);
            }
            quiz.updateIndex(1);
            request.getRequestDispatcher("QuizView.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("quiz", new Quiz());
        request.getRequestDispatcher("QuizView.jsp").forward(request, response);
    }
}


