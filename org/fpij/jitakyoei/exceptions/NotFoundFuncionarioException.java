/*********************************************************************
 *      UNIVERSIDADE FEDERAL DO PIAU� - UFPI                          *
 *      CENTRO DE CI�NCIAS DA NATUREZA - CCN                          *
 *      DEPARTAMENTO DE INFORM�TICA E ESTAT�STICA - DIE               *
 *      BACHARELADO EM CI�NCIA DA COMPUTA��O                          *
 *                                                                    *
 *      DISCIPLINA: PROGRAMA��O II                                    *
 *                                                                    *
 *      PER�ODO:2008.2                                                *
 *      PROF: �TALO MENDES                                            *
 *                                                                    *
 *      IMPLEMENTA��O EM LINGUAGEM JAVA DE UM SISTEMA DE LOCADORA.    *
 *                                                                    *
 *      ALUNO: ALCEMIR RODRIGUES SANTOS                               *
 *      MATR�CULA: 06N10340                                           *                                          
 *                                                                    *
 *      JUNHO DE 2008.                                                *
 *********************************************************************/

package org.fpij.jitakyoei.exceptions;

/**
 *
 * @author A.Santos
 */
@SuppressWarnings("serial")
public class NotFoundFuncionarioException extends NotFoundException {

    @Override
    public String toString() {
        return "O Funcionario buscado parece n�o existir!";
    }
}
