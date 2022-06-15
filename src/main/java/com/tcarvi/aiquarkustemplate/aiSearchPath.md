Machine Learning
Deep Learning

agent
Entity that perceives its environment and acts upon that environment.

state
a configuration of the agent and its environment

initial state
the state in which the agent begin

action
choice that can be made in a state

"Actions" are functions that return the set of actions that can be executed in the state set

Transition model
A description of what the state resulting from performing action a in state s.

Transition model: 
Result ( state, action() ) = other state

State Space
The set of all 
Matriz of states
Operation in theses matrix of states
Resulting in other state

Representation in a neural Graph
Circles are the states
The lines are the Actions

Goal Test
Way to determine whether a given state is a goal state

Path cost
numerical cost assossiated the the path

Solution
A solution that has the lowest path cost among all solutions

Node
a data structure that keeps track of:
- a state
- a parent (node that generated this node)
- an action (action applied to parent to get node)
- a path cost (from initial state do node)

Approach
- Start with a frontier that contains the initial state
- Start with an empty explored set
- Repeat
    - if the frontier is empty, then no solution
    - remove a node from the frontier
    - if node contains goal state, return the solution
    - add the node to the explored set
    - Expand node, add resulting nodes to the frontier if they aren't already in the frontier or the explored set.

Simplest data structure
stack
last-in first-out data type

Depth-First Search algorithm
- Search algorithm that always expands the deepest node in the frontier.
- It's possible that a worse solution had been found

Breadth-First Search algorithm
- Search algorithm that always expands the shallowest node in the frontier.
- Search all paths at the same time.
- It's possible que it explores all possible paths.




    