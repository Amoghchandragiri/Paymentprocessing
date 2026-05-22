import axios from "axios";

const BASE_URL = "http://localhost:8080/api/payments";

class PaymentService {

    getAllPayments() {
        return axios.get(BASE_URL);
    }

    createPayment(payment) {
        return axios.post(BASE_URL, payment);
    }
}

export default new PaymentService();