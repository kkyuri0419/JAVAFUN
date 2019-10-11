# Git 명령어 익히기
<img width="400" height="200" src="https://miro.medium.com/max/875/1*BCZkmZR1_YzDZy22Vn4uUw.png" alt="Gitimg" title="GIT을 익혀보자">
<hr>

![Prunus](http://www.gstatic.com/webp/gallery/4.jpg)

### Git 저장소 영역
| <영역> | 이름 | 설명 |
|:---:|:---:|:---:|
| `<USER>` | Working Directory | .git이 있는 실제 파일들이 있는 작업공간  |
| `<INDEX>` | staging Area | 준비 영역 |
| `<HEAD>` | Local Repository | 최종 확정본 |
| `<GITHUB>` | Remote Repository | Github.com |

<hr>

### Git의 대략적인 흐름
| 영역   | init | add | commit | push | pull | clone | merge | fetch |
|:---:   |:---: |:---:|:---:   |:---: |:---: |:---:  |:---:  |:---:  |
| User   |  `O` |  v  |        |      |  `O` |  `O`  |  `O`  |       |
| INDEX  |      | `O` |    v   |      |   ^  |   ^   |   ^   |       |
| HEAD   |      |     |   `O`  |   v  |   ^  |   ^   |   ^   |  `O`  |
| GITHUB |      |     |        |  `O` |   ^  |   ^   |       |   ^   |

<hr>

### 로컬 --> Github
| 단    계 | 명령어 | 저  장  소 | 설명 |
|:---:|:---:|:---:|:---:|
| `1` | git init | USER | .git파일을 만듭니다. |
| 삭제 | rm -r .git | USER | .git파일을 삭제합니다. |
| `2-1` | git config --global user.name "닉네임" | .GIT | 닉네임을 설정합니다. |
| `2-2` | git config --global user.email "이메일" | .GIT | 이메일을 설정합니다. |
| 확인 | git config --global --list | .GIT | 저장한 글로벌 변수 확인(위치 : C:\Users\<사용자>\.gitconfig) |
| `3` | git remote add origin "주소" | INDEX | Remote Repository을 설정합니다. |
| 삭제 | git remote rm origin | INDEX | 설정된 Remote Repository를 삭제합니다.(주로 오타를 입력해서 다시 시도시 이용) |
| 확인 | git status | INDEX | staging Area에 준비중인 파일/폴더 상태를 보여줍니다. R(unadded), G(added) |
| `4` | git add 파일/폴더 | INDEX-->HEAD | 준비중인 파일/폴더를 확정시킵니다. |
| 취소 | git reset HEAD파일/폴더 | HEAD-->INDEX | ROLLBACK! |
| `5` | git commit -m "확정본에 대한 설명" | HEAD | 해당 작업에 대한 commit을 생성합니다. |
| `6` | git push -u origin master | HEAD-->GITHUB | github.com에 이동! |

<hr>

### Github --> 로컬
| 명령어 | 저  장  소 | 설명 |
|:---:|:---:|:---:|
| git fetch | GITHUB-->HEAD | Remote Repository를 HEAD영역으로 끌어옵니다. |
| git merge | HEAD-->USER | HEAD에 있는 내용을 USER에 옮깁니다. |
| git pull | GITHUB-->USER | Remote Repository의 정보를 USER에 있는 .GIT에 옮깁니다. |
| git clone | GITHUB-->USER | Remote Reposiory를 복사해서 USER에 붙여넣습니다. |

git pull origin branchname --allow-unrelated-histories

<hr>

### Branch
| 명령어 | 설명 |
|:---:|:---:|
| git checkout -b (추가할 브랜치이름) | 브랜치를 생성한 후 생선된 브랜치에 이동합니다. |
| git checkout (브랜치이름) | 브랜치에 이동합니다. |
| git branch -d (삭제할 브랜치이름) | 브랜치를 삭제합니다. |
| git branch | 로컬 브랜치를 확인합니다. |
| git branch -r | 원격 브랜치를 확인합니다. |
| git branch -a | 로컬+원격 브랜치를 확인합니다. |

### GIT FUN


[LEARN_GIT_BRANCHING][1]

[1]:https://learngitbranching.js.org/

