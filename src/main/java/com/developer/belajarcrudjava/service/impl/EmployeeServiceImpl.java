package com.developer.belajarcrudjava.service.impl;

import com.developer.belajarcrudjava.entity.EmployeeEntity;
import com.developer.belajarcrudjava.repository.EmployeeRepository;
import com.developer.belajarcrudjava.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}
//    Penjelasan kode diatas yaitu :
//        - @Service : adalah annotasi bahwa kita membuat komponen untuk layer Service
//        - @Autowired adalah annotasi yang menginjika kita untuk menginject sebuah class dalam hal
//        ini yaitu kita menginject interface ProductRepository
//        - List<Product> findAllProducts() method yang digunakan untuk mengembalikan
//        nilai product yang ada di database yang nantinya akan dikembalikan ke controller sebagai
//        pemanggil dari method ini
//        - Product findProductById(Long id) method untuk mencari data single Product
//        berdasarkan id yang diberikan dari Controller. Namun dalam method ini diberi logic jika data
//        product nya tidak ada di database berdasarkan ID yang diberikan maka method ini
//        mengembalikan object Product kosong.
//        - Product saveorUpdateProduct(Product product) method untuk menyimpan data
//        produk baru atau memperbaharui data product.
//        - deleteProduct(Long id) method ini untuk menghapus data produk berdasarkan ID
