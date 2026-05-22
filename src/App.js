import React, { useEffect, useState } from "react";
import "./App.css";

import PaymentForm from "./components/PaymentForm";
import PaymentList from "./components/PaymentList";

import PaymentService from "./services/PaymentService";

function App() {

    const [payments, setPayments] = useState([]);

    const getAllPayments = () => {

        PaymentService.getAllPayments()
            .then((response) => {
                setPayments(response.data);
            })
            .catch(error => {
                console.log(error);
            });
    };

    useEffect(() => {
        getAllPayments();
    }, []);

    return (

        <div className="container">

            <h1>Payment Processing System</h1>

            <PaymentForm refreshPayments={getAllPayments} />

            <PaymentList payments={payments} />

        </div>
    );
}

export default App;