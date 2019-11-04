---
layout: page
title: Delete a repository
description: How to delete a GitHub repository
---

To delete your repository on Github:

- View it in a web browser (say <https://github.com/myaccount/myrepo>)

- Click on &ldquo;Settings&rdquo; (below the Unwatch/Star/Fork buttons
  on the right)

- Scroll down to &ldquo;Danger Zone&rdquo; and click &ldquo;Delete this Repository&rdquo;

- Confirm the name of the repository

On your local machine, the `.git` directory/folder within your repository's
directory contains the full git history. If you delete that directory,
it will no longer be a git repository but will go back to being a
regular project directory.
(You could [start over](init.html) by typing `git init`, adding files
with `git add`, and then `git commit`.)

**Next**: [Git/github with RStudio](rstudio.html)
