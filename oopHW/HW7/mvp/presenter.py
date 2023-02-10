from HomeWork7_OOP.mvp import Data_File, View_Console
from HomeWork7_OOP.models import Worker_Builder

# Класс Presenter связывает работу View и Model для отображения актуальной информации и обработки данных от пользователя
class Presenter:
    __data: Data_File
    __view: View_Console

    def __init__(self, view: View_Console, data: Data_File):
        self.__data = data
        self.__view = view

    def add_worker(self):
        worker = Worker_Builder(self.__view.input_full_name()) \
            .set_date_of_birth(self.__view.input_date_of_birth()) \
            .set_division(self.__view.input_division()) \
            .set_position(self.__view.input_position()) \
            .set_salary(self.__view.input_salary()) \
            .build()
        self.__data.save_worker(worker_list=worker.get_worker_list())

    def show_workers(self):
        self.__view.show_workers(self.__data.load_workers())

    def show_menu(self):
        self.__view.show_start_menu()

    def show_error(self):
        self.__view.show_error_message()

    def show_added(self):
        self.__view.show_added_message()

    def show_exit(self):
        self.__view.exit_message()

    def input_menu(self):
        return self.__view.input_menu()