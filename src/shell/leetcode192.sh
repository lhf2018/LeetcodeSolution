#!/usr/bin/env bash
# Read from the file words.txt and output the word frequency list to stdout.
awk '{
    for(i=1;i<=NF;i++){
    res[$i]+=1  #以字符串为索引，res[$i]相同的累计
    }
}END{
    for(k in res){
        print k" "res[k]
    }
}' words.txt | sort -nr -k2 # n：按数值排序，r：倒序，k：按第2列排序