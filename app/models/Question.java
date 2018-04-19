package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Question extends Model {
    
    
    @Constraints.Required
    private String name;

    @Constraints.Required
    private String Email;

    @Constraints.Required
    private String Question;

    

    public Question() {
        
    }

    public Question (String name, String Email, String Question) {
        this.name = name;
        this.Email =Email;
        this.Question= Question;

    }
    public static final Finder<Long, Product> find = new Finder<>(Product.class);
    
        public static final List<Question> findAll() {
            return Question.find.all();
        }
        
        
        public void setId(long id) {
            this.id = id;;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return Question;
        }
        public void setEmail(String Email) {
            this.Email = Email;
        }
        public int getQuestion() {
            return Question;
        }
        public void setQuestion(int Question ) {
            this.Question = Question;
        }
       
       
    }
