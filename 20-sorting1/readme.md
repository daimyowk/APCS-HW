Test1-10 integers
ssort takes 0.1 seconds. Longest 0.106 sec
isort most of the time takes 0.1 sec. Longest 0.107
bsort also usualy 0.1 sec. Longest 1.04 sec
builtin usualy 0.1. Longest 1.09 sec
When sorting small arrays, methods don't really differ, all are fine

Test2-100000 integers
isort usually takes 1.6 seconds
ssort usually takes 7.8 secs
bsort usually takes 25.3 secs
builtin only takes 0.113 secs
With large arrays, builtin one is best to use. Then isort,ssort, and bsort.

Test3- 100000 integers sorted decending
isort takes 3.1 secs
ssort takes 6.8 secs
bsort takes 18.5 secs
builtin takes 0.11 secs

isort does alot more assignments than ssort as the arrays get larger
when the array is small isort and ssort do the same amount of assignments
same applies to comparisions done
isort does lot more than ssort when array large
when array small does basically same amount of comparsions

builtin sort seems to be the best overall