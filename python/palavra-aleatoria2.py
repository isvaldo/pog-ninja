# -*- coding: utf-8 -*-
import random

def rd_string(length):
        """
        Criando Strings aleatórias com listas
        """
        list_alfa = list("abcdefghijklmnopqrstuvwxyz")
        str_rd = ""
        while(len(str_rd)<=length):
                str_rd +=  random.choice(list_alfa)
        return str_rd


# Testing
for n in range(0,100):
        print rd_string(n)
