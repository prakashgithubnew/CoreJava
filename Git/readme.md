GIT Merge
=========

1. Master branch is avaialble
2. Create feature branch-feature2 from Master and start working on one chnage
3. Now one bug fix comes and developer creates a new branch from Master-->Bug-Fix-Feature
4. He fixes the code in Bug-Fix-Feature branch and commits the code in Bug-Fix-Feature
5. Later on he merges code of Bug-Fix-Feature branch in Master.
6. Now Feature1 does not have a latest changes of Master and Master is 2 commit ahead.
7. Now to sync feature2 and Master both Below commands will be run
   git switch feature2
   git merge master
8. After above commands Master has come to feature2 branch.
9. Now feature2 innitial chnages are not in master so run below commands
git switch master
git merge feature2

Now master is in sync with all changes and ready for deployment.

Usually GIT MERGE is used to preserve history 
**GIT REBASE**
-------------------
