# The Rules 


commits:<br>
-infinitive verbs (add, remove, fix, etc)<br>
-descriptive<br>
-example: fix buy methods in user class<br>

branches:<br>
-naming: dev_name/feature||bugfix/task-name<br>
-example: cristian/feature/add-rent-method-to-user-class<br>

workflow:<br>
-assign task in trello<br>
-move task to "In Progress"<br>
-git checkout dev<br>
-git pull origin dev<br>
-git checkout -b cristian/feature/my-branch<br>
-work, commit changes<br>
-git add files<br>
-git commit -m"add bla bla"<br>
-git push origin HEAD (or my-branch)<br>
-create PR in github, base:dev compare:my-branch<br>
-description: trello card url<br>
-trello: comment pull request url in task card
-move card to "Pending Verification"<br>

NEVER PUSH TO MASTER
