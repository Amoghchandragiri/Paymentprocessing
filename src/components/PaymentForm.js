import React, { useState } from "react";
import PaymentService from "../services/PaymentService";

function PaymentForm({ refreshPayments }) {

    const [payment, setPayment] = useState({
        senderName: "",
        receiverName: "",
        amount: "",
        transactionType: "",
        status: ""
    });

    const handleChange = (e) => {
        setPayment({
            ...payment,
            [e.target.name]: e.target.value
        });
    };

    const savePayment = (e) => {
        e.preventDefault();

        PaymentService.createPayment(payment)
            .then(() => {
                alert("Payment Added Successfully");

                setPayment({
                    senderName: "",
                    receiverName: "",
                    amount: "",
                    transactionType: "",
                    status: ""
                });

                refreshPayments();
            })
            .catch(error => {
                console.log(error);
            });
    };

    return (
        <div className="form-container">

            <h2>Add Payment</h2>

            <form onSubmit={savePayment}>

                <input
                    type="text"
                    name="senderName"
                    placeholder="Sender Name"
                    value={payment.senderName}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="receiverName"
                    placeholder="Receiver Name"
                    value={payment.receiverName}
                    onChange={handleChange}
                    required
                />

                <input
                    type="number"
                    name="amount"
                    placeholder="Amount"
                    value={payment.amount}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="transactionType"
                    placeholder="Transaction Type"
                    value={payment.transactionType}
                    onChange={handleChange}
                    required
                />

                <input
                    type="text"
                    name="status"
                    placeholder="Status"
                    value={payment.status}
                    onChange={handleChange}
                    required
                />

                <button type="submit">
                    Save Payment
                </button>

            </form>

        </div>
    );
}

export default PaymentForm;