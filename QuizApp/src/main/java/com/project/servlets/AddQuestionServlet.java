package com.project.servlets;
import java.io.IOException;
import com.project.dao.QuestionDao;
import com.project.model.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/admin/addQuestion")
public class AddQuestionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private QuestionDao questionDAO = new QuestionDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("admin") == null) {
			response.sendRedirect(request.getContextPath() + "/admin/login");
			return;
		}
		request.getRequestDispatcher("/admin/addQuestion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("admin") == null) {
			response.sendRedirect(request.getContextPath() + "/admin/login");
			return;
		}

		String questionText = request.getParameter("questionText");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		int correctOption = Integer.parseInt(request.getParameter("correctOption"));
		String correctOptionStr = request.getParameter("correctOption");
		String category = request.getParameter("category");

		if (questionText == null || questionText.trim().isEmpty() || option1 == null || option2 == null
				|| option3 == null || option4 == null || correctOptionStr == null || category == null) {
			request.setAttribute("error", "All fields are required!");
			request.getRequestDispatcher("/admin/addQuestion.jsp").forward(request, response);
			return;
		}
		try {
			correctOption = Integer.parseInt(correctOptionStr);
			if (correctOption < 1 || correctOption > 4) {
				throw new IllegalArgumentException("Correct option must be between 1 and 4");
			}
		} catch (Exception e) {
			request.setAttribute("error", "Invalid correct option value!");
			request.getRequestDispatcher("/admin/addQuestion.jsp").forward(request, response);
			return;
		}

		Question question = new Question();
		question.setQuestionText(questionText);
		question.setOption1(option1);
		question.setOption2(option2);
		question.setOption3(option3);
		question.setOption4(option4);
		question.setCorrectOption(correctOption);
		question.setCategory(category);

		boolean success = questionDAO.addQuestion(question);

		if (success) {
			request.setAttribute("success", "Question added successfully!");
		} else {
			request.setAttribute("error", "Failed to add question!");
		}

		request.getRequestDispatcher("/admin/addQuestion.jsp").forward(request, response);
	}
}