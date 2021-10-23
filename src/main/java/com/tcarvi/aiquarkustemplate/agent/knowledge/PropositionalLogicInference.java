package com.tcarvi.aiquarkustemplate.agent.knowledge;

/*
 * PropositionalLogicInference
 * The process of deriving new sentences from old ones.
 * Does the Knowledge base entails symbol a?
 * That's the algorithm of Artificial Inteligence!
 * How do codify this algorithm?
 * Examples:
 * - Model Checking
 *   To determine if KB entails a,
 *      - enumerate all possible models
 *      - If in every model where KB is true, a is true, then kb entails a.
 *        - We verified if KB is true! (we checked the models of KB)
 *      - Otherwise, KB does not entail a.
 *    Ex: p:
 *        q:
 *        r:
 *        KB = (P ConjunctionAnd not(Q)) ImplicationIfSo a
 *        We verify all values of the True Table
 *        Each line of a True-False table is a model. (a set of assignments)
 *        So, we must discover if all models concludes that KB is true.
 *        If all models concludes that, we say that KB entails a.
 *        And that a is also true. 
 */
/*
 * P, NP, NP-complete and NP-Hard problems
 * 
 * P (problems solved by a deterministic Turing machine in Polynomial time)
 * P is subset of NP 
 * Any P problem that can be solved by a deterministic machine in polynomial time (definition of a P problem)
 *   can also be solved by a non-deterministic machine in polynomial time. 
 * So:
 *    P is a set of problems that can be solved by a deterministic Turing machine in Polynomial time.
 *    And any of these problems can also be solved by non-deterministic machine in polynomial time
 * Examples:
 *  - Shortest path problem -> Diferents algoriths with diferent (Big O) time.
 *  - Euler graph problem solved by Hierholzer's algorithm in Linear Time -> n

 * 
 * NP (problems solved by a Non-deterministic Turing machine in Polynomial time)
 * Some NP problems can also be solved by deterministic Turing machine. In that case, they are called P problems.
 * NP is a set of decision problems that can be solved by a Non-deterministic Turing Machine in Polynomial time.
 * Informally, NP is a set of decision problems that can be solved by a polynomial-time via a 
 *   “Lucky Algorithm”, a magical algorithm that always makes a right guess among the given 
 *   set of choices.
 * 
 * NP-complete problems are the hardest problems in the NP set.
 *   P and NP-complete problems are different
 *   Any P problem isn't an NP-complete problem
 *   Any NP-complete problem isn't a P problem
 * A decision problem L is NP-complete if: 
 *   1) L is in NP (Any given solution for NP-complete problems can be verified quickly, but there is no efficient known solution). 
 *   2) Every problem in NP is reducible to L in polynomial time
 * Example:
 *  - Vertex covering problem
 * 
 * A problem is NP-Hard if it follows property 2 mentioned above, doesn’t need to follow property 1. 
 * Therefore, the NP-Complete set is also a subset of the NP-Hard set. 
 * Example:
 *  - Turning halting problem
 * 
 * P problems
 * Problems solved in Polynomial Time:
 *   Euler graph problem -> Hierholzer's algorithm solving in Linear Time -> n
 *   Linear Search -> n
 *   Binary Search -> log(n)
 *   InsectionSort -> n^2
 *   MergeSort -> n log(n)
 *   Matrix Multiplication -> n^3
 * 
 * Exponential Time
 *   O/I KnapSack -> 2^n
 *   Traveling SP -> 2^n
 *   Sum of Subsets -> 2^n
 *   Graph Coloring -> 2^n
 *   Hamiltonian Cycle -> 2^n
 * 
 *  Euler graph
 *  Minimum spanning tree
 * 
 *  Turing Halting problem -> 
 *     A program to resolve this problem will eventually halt when run with its input, or will run forever.
 *     Alan Turing proved that a general algorithm to solve the halting problem for all possible program-input pairs cannot exist.
 * 
 *  NP complete problems are problems whose status is unknown.
 *     No polynomial time algorithm has yet been discovered for any NP complete problem, 
 *       nor has anybody yet been able to prove that no polynomial-time algorithm exists
 *       for any of them. The interesting part is, if any one of the NP complete problems 
 *       can be solved in polynomial time, then all of them can be solved. 
 */

public class PropositionalLogicInference {
    //
}
