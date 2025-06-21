<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&color=F729BF&background=FF2B2B00&multiline=true&width=435&lines=%D0%A2%D0%B5%D1%81%D1%82+%D0%BD%D0%B0%D1%85%D0%BE%D0%B4%D0%B8%D1%82+%D0%B2+%D1%80%D0%B5%D0%BF%D0%BE%D0%B7%D0%B8%D1%82%D0%BE%D1%80%D0%B8+selenide+%D0%B2+wiki+%D0%BA%D0%BE%D0%B4+%D0%BF%D0%BE+SoftAssertions+%D0%B4%D0%BB%D1%8F+JUnit5;wiki+%D0%BA%D0%BE%D0%B4+%D0%BF%D0%BE+SoftAssertions+%D0%B4%D0%BB%D1%8F+JUnit5" alt="Typing SVG" /></a>


![worktester1](https://github.com/user-attachments/assets/9d289d3a-ada5-40ce-8867-0b5580714471)


- uses: Platane/snk@v3
  with:
    # github user name to read the contribution graph from (**required**)
    # using action context var `github.repository_owner` or specified user
    github_user_name: ${{ github.repository_owner }}

    # list of files to generate.
    # one file per line. Each output can be customized with options as query string.
    #
    #  supported options:
    #  - palette:     A preset of color, one of [github, github-dark, github-light]
    #  - color_snake: Color of the snake
    #  - color_dots:  Coma separated list of dots color.
    #                 The first one is 0 contribution, then it goes from the low contribution to the highest.
    #                 Exactly 5 colors are expected.
    outputs: |
      dist/github-snake.svg
      dist/github-snake-dark.svg?palette=github-dark
      dist/ocean.gif?color_snake=orange&color_dots=#bfd6f6,#8dbdff,#64a1f4,#4b91f1,#3c7dd9
