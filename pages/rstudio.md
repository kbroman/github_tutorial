---
layout: page
title: git/github with RStudio
description: Use of git/GitHub in RStudio
---

[RStudio](https://www.rstudio.com/ide) is a popular development
environment for [R](https://www.r-project.org).

RStudio has built-in facilities for [knitr](https://yihui.name/knitr/)
(the superb successor to [Sweave](https://www.stat.uni-muenchen.de/~leisch/Sweave/)) and [R Markdown](https://rmarkdown.rstudio.com) (a
variant of
[Markdown](https://daringfireball.net/projects/markdown/syntax)), which
are highly recommended for writing data analysis reports.

And RStudio has built-in facilities for [git](https://git-scm.com/) and
[GitHub](https://www.github.com).  See
[this document on how to use version control with RStudio](https://support.rstudio.com/hc/en-us/articles/200532077-Version-Control-with-Git-and-SVN). It's
pretty straightforward.

Basically, in RStudio you want to create a Project
([described further here](https://www.rstudio.com/ide/docs/using/projects)),
which is basically a directory with some special files to describe
project-specific RStudio options. This Project will be your git
repository. Or you can easily turn a current git repository into an
RStudio Project. And then you can use items in the menu bar to commit
changes and push or pull from GitHub.

**Next**: [Other resources](resources.html)
