# Класс ViewConsole  для работы в консоле и вывода на экран
class View_Console:
    __start_menu = "1: Добавить сотрудника\n2: Показать сотрудников\n0: Выход"
    __success_added = "Сотрудник успешно добавлен"

    def __init__(self):
        pass

    def show_added_message(self):
        print(f'\n{self.__success_added}\n')

    def show_start_menu(self):
        print(f'\n{self.__start_menu}\n')

    def input_full_name(self):
        return input('Введите ФИО: ')

    def input_date_of_birth(self):
        return input('Введите дату рождения: ')

    def input_division(self):
        return input('Введите подразделение организации: ')

    def input_position(self):
        return input('Введите должность сотрудника: ')

    def input_salary(self):
        return input('Введите оклад: ')

    def input_menu(self):
        return input('Выберите пункт меню: ')

    def show_error_message(self):
        print('\nВыбирайте нужный пункт меню!\n')

    def exit_message(self):
        print('\nВсего доброго!\n')

    def show_workers(self, workers_list):
        for worker in workers_list:
            print('\n')
            for line in worker:
                print(line)