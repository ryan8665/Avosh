/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avosh.baseproject.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amirk
 */
@Entity
@Table(name = "session_question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SessionQuestion.findAll", query = "SELECT s FROM SessionQuestion s")
    , @NamedQuery(name = "SessionQuestion.findById", query = "SELECT s FROM SessionQuestion s WHERE s.id = :id")
    , @NamedQuery(name = "SessionQuestion.findByCorrect", query = "SELECT s FROM SessionQuestion s WHERE s.correct = :correct")})
public class SessionQuestion implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "correct")
    private Short correct;
    @JoinColumn(name = "session_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Session sessionId;
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Question questionId;

    public SessionQuestion() {
    }

    public SessionQuestion(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getCorrect() {
        return correct;
    }

    public void setCorrect(Short correct) {
        this.correct = correct;
    }

    public Session getSessionId() {
        return sessionId;
    }

    public void setSessionId(Session sessionId) {
        this.sessionId = sessionId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessionQuestion)) {
            return false;
        }
        SessionQuestion other = (SessionQuestion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SessionQuestion[ id=" + id + " ]";
    }
    
}
