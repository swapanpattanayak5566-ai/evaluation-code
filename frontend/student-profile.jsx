
import React from 'react';
import './StudentProfile.css';

function StudentProfile(props) {
    return (
        <div className="profile-card">

            <img
                src={props.image}
                alt="Student Profile"
                className="profile-image"
            />

            <h2>{props.name}</h2>

            <p><b>Email:</b> {props.email}</p>

            <p><b>Course:</b> {props.course}</p>

        </div>
    );
}

export default StudentProfile;
