size = 5
total_size = size * 2 + 1

for i in range(total_size):
    row_pattern = ''
    for j in range(total_size):
        if  j == size:
            row_pattern += '|'
        elif i < size and j < size:  
            row_pattern += '*' if i >= j else ' '
        elif i < size and j > size:
            row_pattern += '*' if i >= total_size - j - 1 else ' '
        elif i > size and j < size:
            row_pattern += '*' if total_size - i - 1 >= j else ' '
        else:
            row_pattern += '*' if total_size - i - 1 >= total_size - j - 1 else ' '
    print(row_pattern)

