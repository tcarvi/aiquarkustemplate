https://cs50.harvard.edu/ai/2020/notes/1/

- A system must reason based on existing knowledge to draw conclusions.
- The concept of representing knowledge
- The concept of drawing conclusions from some knowledge.

Knowledge-Based Agents
- These are agents that reason by operating on internal representations of knowledge.
- What does “reasoning based on knowledge to draw a conclusion” mean?
- Example of sentences:
    - If it didn’t rain, Harry visited Hagrid today.
    - Don't start by conditionals.
    - Start always by facts, creating simple Knowledge.
    - Sentences: 
    a: ( Harry visited Hangrid ExclusiveOr Harry visited Dumbledore ) == true
    b: ( Harry visited Dumbledore today )
    THE SINPLEST IS B. So:
    a: HVA ExclusiveOr HVD == true
    b: HVD == true
    So, starting by b: and goint to a:
    a: HVA ExclusiveOr true == true
    So, HVA == false
    So, !HVA === true
    So, Harry did not visit Hangrid today.
    Now, doing the same to 1: If it didn’t rain, Harry visited Hagrid today.
    By math symbols: 
    it didn't rain -> Harry visited Hagrid today
    We know that Harry visited Hagrid today == false.
    So, by propostional reasoning:
    ( it didn't rain -> false ) == true
    So it did'nt rain must be false. It can't be true.
    So. It didn't rains is false.
    So, It did rain is true.
    
Propositional Logic
Propositional logic is based on propositions, statements about the world that can be either true or false, as in sentences above.

Propositional Symbols
Propositional symbols are most often letters (P, Q, R) that are used to represent a proposition.

Logical Connectives
Logical connectives are logical symbols that connect propositional symbols in order to reason in a more complex way about the world.

Not (¬) inverses the truth value of the proposition. So, for example, if P: “It is raining,” then ¬P: “It is not raining”.
Truth tables are used to compare all possible truth assignments to propositions. This tool will help us better understand the truth values of propositions when connected with different logical connectives. For example, below is our first truth table:

And (∧) connects two different propositions. When these two proposition, P and Q, are connected by ∧, the resulting proposition P ∧ Q is true only in the case that both P and Q are true.
P       Q       P ∧ Q
false	false	false
false	true	false
true	false	false
true	true	true


Inclusive Or (∨) is true as as long as either of its arguments is true. This means that for P ∨ Q to be true, at least one of P or Q has to be true.
P       Q       P ∨ Q
false	false	false
false	true	true
true	false	true
true	true	true
It is worthwhile to mention that there are two types of Or: an inclusive Or and an exclusive Or. In an exclusive Or, P ∨ Q is false if P ∧ Q is true. That is, an exclusive Or requires only one of its arguments to be true and not both. An inclusive Or is true if any of P, Q, or P ∧ Q is true. In the case of Or (∨), the intention is an inclusive Or.

Exclusive Or (∨) is true as as long as both of its arguments is true. This means that for P XOR Q to be true, both P and Q has to be true.
P       Q       P XOR Q
false	false	false
false	true	true
true	false	true
true	true	true