package sbb.question;

import com.mysite.sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<com.mysite.sbb.question.Question, Integer> {
	com.mysite.sbb.question.Question findBySubject(String subject);

	com.mysite.sbb.question.Question findBySubjectAndContent(String subject, String content);

	List<Question> findBySubjectLike(String subject);
}
