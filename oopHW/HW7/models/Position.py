# Класс Position для получения и подстановки должности
class Position:
    __company_positions = ["Офисный разнорабочий", "Управляющий",
                           "Старший сотрудник", "Сотрудник",
                           "Младший сотрудник", "Стажер"]
    __position: str

    def __init__(self):
        self.__position = self.__company_positions[0]

    def set_position(self, position: str):
        self.__position = self.__company_positions[0]
        for i in range(len(self.__company_positions)):
            if position == self.__company_positions[i]:
                self.__position = position
                break

    def get_position(self):
        return self.