# Класс Division для получения и подстановки подразделения
class Division:
    __company_divisions = ["Управляющая компания", "Продажи", "Закупки", "Склад"]
    __division: str

    def __init__(self):
        self.__division = self.__company_divisions[0]

    def set_division(self, division: str):
        self.__division = self.__company_divisions[0]
        for i in range(len(self.__company_divisions)):
            if division == self.__company_divisions[i]:
                self.__division = division
                break

    def get_division(self):
        return self.__division